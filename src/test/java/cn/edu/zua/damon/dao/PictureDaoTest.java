package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.Picture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.Date;

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
        Picture p1 = pictureDao.findPictureById(1L);
        LOG.debug("picture:{}", p1);
    }

    @Test
    public void test() {
        Picture picture = new Picture();
        picture.setId(2L);
        picture.setPath("/tmp/zs.png");
        picture.setType(1);
        picture.setTargetUrl("https://img-blog.csdn.net/20180523141459552?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3VfYXNjZW5k/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70");
        picture.setGrade(1);
        Date now = new Date();
        picture.setGmtCreate(now);
        picture.setGmtModified(now);
        LOG.debug("picture:{}", picture);
    }
}
