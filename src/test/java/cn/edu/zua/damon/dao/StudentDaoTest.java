package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

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

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Test
    public void testFindStudentById() {
        Student student = studentDao.findStudentById(2L);
        System.out.println("student = " + student);
    }
}
