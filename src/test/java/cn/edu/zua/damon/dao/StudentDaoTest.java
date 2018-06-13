package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.domain.StudentDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * StudentDaoTest
 *
 * @author ascend
 * @date 2018/6/11 17:14.
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class StudentDaoTest extends AbstractTestNGSpringContextTests {
    private static final Logger LOG = LoggerFactory.getLogger(StudentDaoTest.class);
    private StudentDao studentDao;

    public StudentDaoTest() {
    }

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Test
    public void testGetStudentById() {
        StudentDO student = studentDao.getStudentById(2L);
        System.out.println("student = " + student);
    }

    @Test
    public void testGetStudentById2() {
        Map<String, Object> map = studentDao.getStudentById2(2L);
        System.out.println("map = " + map);
    }

    @Test
    public void testGetStudentById3() {
        StudentDO student = studentDao.getStudentById3(2L);
        System.out.println("student = " + student);
    }
}
