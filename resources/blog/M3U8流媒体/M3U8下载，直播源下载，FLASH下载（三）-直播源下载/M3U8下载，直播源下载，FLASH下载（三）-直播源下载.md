# 前言 #
　　在工作或者生活中，我们往往会在网页中碰见一些不错的视频，想下载下来存到本地，但是无奈视频是flash播放的，不能在开发者工具中找到视频的绝对地址进行下载，反而是找到了个直播源，譬如：http://video.newsapp.cnr.cn/data/video/2018/7358/index.m3u8
这样的链接是直播源地址，很多电视台的流媒体或者网络直播就是采用这样的方式，优点我就不说了，请自己baidu。
# 准备 #
**JDK安装**  
**ffmpeg安装**:[https://blog.csdn.net/u_ascend/article/details/80418402](https://blog.csdn.net/u_ascend/article/details/80418402 "M3U8下载，直播源下载，FLASH下载（一）-ffmpeg安装手册(windows)")  
# 代码 #
    package cn.edu.zua.common.util.audio;

import cn.edu.zua.common.util.UtilTools;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * AudioM3U8Downloader
 *
 * @author ascend
 * @date 2018/3/29 11:07.
 */
public class AudioM3U8Downloader {
    private static final Logger LOG = LoggerFactory.getLogger(AudioM3U8Downloader.class);

    private static final String basePath = "/tmp/";
    private static final int downloaderMaxSecond = 120;

    private AudioM3U8Downloader() {
    }

    public static void main(String[] args) throws Exception {
        // byte[] bytes = downloadBytes("http://recordcdn.quklive.com/upload/vod/user1462960877450854/1522247411932701/3/video.m3u8");
        // System.out.println(bytes.length);
        File file = downloadFile("http://recordcdn.quklive.com/upload/vod/user1462960877450854/1522247411932701/3/video.m3u8");
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
    }

    public static File downloadFile(String m3u8Url) throws InterruptedException, IOException {
        String fileName = UtilTools.getUUIDyyyyMMddHHmmss();
        File f = new File(basePath);
        if (!f.exists()) {
            boolean mkdirs = f.mkdirs();
        }
        String fullFileName = basePath + fileName + ".mp4";
        String command = "ffmpeg -i " + m3u8Url + " -vcodec copy " + fullFileName + " -y";
        LOG.debug("execute command:{}", command);
        Process process = Runtime.getRuntime().exec(command);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        getStream(executorService, process.getErrorStream(), true);
        getStream(executorService, process.getInputStream(), false);
        TimeUnit.SECONDS.sleep(8);
        File file = new File(fullFileName);
        long size = 0;
        final boolean[] checkFlag = {true};
        executorService.execute(() -> {
            try {
                // 下载线程超时时间
                TimeUnit.SECONDS.sleep(downloaderMaxSecond);
                checkFlag[0] = false;
            } catch (InterruptedException e) {
                LOG.error("关闭下载线程任务出错：", e);
                // 中断当前线程
                Thread.currentThread().interrupt();
            }
        });

        while (checkFlag[0]) {
            long fileLength = file.length();
            LOG.debug("size:{}, length:{}", size, fileLength);
            if (file.length() != size) {
                size = file.length();
                TimeUnit.SECONDS.sleep(5);
            } else {
                checkFlag[0] = false;
            }
        }
        process.destroy();
        executorService.shutdown();
        process.waitFor();
        LOG.info("文件下载成功：{}", file.getAbsolutePath());
        return file;
    }

    public static byte[] downloadBytes(String m3u8Url) throws InterruptedException, IOException {
        File file = downloadFile(m3u8Url);
        TimeUnit.SECONDS.sleep(2);
        // byte[] bytes = FileCopyUtils.copyToByteArray(file);
        byte[] bytes = IOUtils.toByteArray(FileUtils.openInputStream(file));
        if (file.exists()) {
            boolean delete = file.delete();
        }
        return bytes;
    }


    private static void getStream(ExecutorService executorService, final InputStream inputStream, final boolean printFlag) {
        executorService.execute(() -> {
            BufferedInputStream in = new BufferedInputStream(inputStream);
            byte[] bytes = new byte[1024];
            try {
                while (in.read(bytes) != -1) {
                    String s = new String(bytes, 0, bytes.length);
                    if (printFlag) {
//                            LOG.error("ffmpeg:error when downloading!\ninfo:"+s);
                    }
//                        LOG.debug("read from inputstream:{}", s);
                }
            } catch (IOException e) {
                LOG.error("读取下载流失败", e);
            } finally {
                try {
                    in.close();
                } catch (IOException e) {
                    LOG.error("关闭读取流失败：", e);
                }
            }
        });
    }
}


ffmpeg安装：


