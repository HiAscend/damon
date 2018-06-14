package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.domain.PictureDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PictureDaoTest
 *
 * @author ascend
 * @date 2018/6/1 17:41.
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class PictureDaoTest extends AbstractTestNGSpringContextTests {
    private static final Logger LOG = LoggerFactory.getLogger(PictureDaoTest.class);
    private PictureDao pictureDao;

    public PictureDaoTest() {
    }

    @Autowired
    public void setPictureDao(PictureDao pictureDao) {
        this.pictureDao = pictureDao;
    }

    @Test
    public void testFindPictureById() {
        PictureDO p1 = pictureDao.getPictureById(1L);
        LOG.debug("picture:{}", p1);
    }

    @Test
    public void test() {
        PictureDO picture = new PictureDO();
        picture.setId(2L);
        picture.setPath("/tmp/zs.png");
        picture.setPictureType(1);
        picture.setTargetUrl("https://img-blog.csdn.net/20180523141459552?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3VfYXNjZW5k/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70");
        picture.setGrade(1);
        Date now = new Date();
        picture.setGmtCreate(now);
        picture.setGmtModified(now);
        LOG.debug("picture:{}", picture);
    }

    @Test
    public void testListPictures() {
        Map<String, Object> parameter = new HashMap<>();
        parameter.put("targetUrl", "%5a6L5L2T%");
        parameter.put("pictureType", 1);
        parameter.put("grade", 1);
        // parameter.put("start", 1);
        // parameter.put("size", 6);
        // parameter.put("number", 1);
        List<PictureDO> pictureList = pictureDao.listPictures(parameter);
        System.out.println("pictureList = " + pictureList);
    }

    @Test
    public void testGetTotalPictures() {
        Map<String, Object> parameter = new HashMap<>();
        parameter.put("targetUrl", "%5a6L5L2T%");
        Long totalPictures = pictureDao.countTotalPictures(parameter);
        System.out.println("totalPictures = " + totalPictures);
    }

    @Test
    public void testInsertPicture() {
        PictureDO picture = new PictureDO();
        picture.setPath("/tmp/wl.png");
        picture.setPictureType(1);
        picture.setTargetUrl("https://img-blog.csdn.net/20180528091502317?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3VfYXNjZW5k/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70");
        picture.setGrade(1);
        int result = pictureDao.insertPicture(picture);
        System.out.println("result = " + result);
    }

    @Test
    public void testUpdatePicture() {
        PictureDO picture = new PictureDO();
        picture.setId(1L);

        picture.setPath("/tmp/zs.png.update");
        picture.setPictureType(2);
        int result = pictureDao.updatePicture(picture);
        System.out.println("result = " + result);
    }

    @Test
    public void testDeletePicture() {
        int result = pictureDao.deletePicture(4L);
        System.out.println("result = " + result);
    }

}
