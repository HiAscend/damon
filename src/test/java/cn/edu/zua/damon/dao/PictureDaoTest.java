package cn.edu.zua.damon.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * PictureDaoTest
 *
 * @author ascend
 * @date 2018/6/1 17:41.
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class PictureDaoTest extends AbstractTestNGSpringContextTests {
    private PictureDao pictureDao;

    public PictureDaoTest() {
    }

    @Autowired
    public void setPictureDao(PictureDao pictureDao) {
        this.pictureDao = pictureDao;
    }

    @Test
    public void testFindPictureById() {

    }
}
