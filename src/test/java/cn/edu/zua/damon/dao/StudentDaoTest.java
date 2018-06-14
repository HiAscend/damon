package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.domain.test.StudentDO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.*;

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

    @Test
    public void testGetStudentById4() {
        StudentDO student = studentDao.getStudentById4(2L);
        System.out.println("student = " + student);
    }

    @Test
    public void testGetStudentById5() {
        StudentDO student = studentDao.getStudentById5(2L);
        System.out.println("student = " + student);
        System.out.println("student = " + student);
    }

    @Test
    public void testGetStudentById6() {
        StudentDO student = studentDao.getStudentById6(3L);
        System.out.println("student = " + student);
    }

    @Test
    public void testGetStudentById7() {
        List<StudentDO> list = studentDao.getStudentById7(Arrays.asList(1L, 2L));
        System.out.println("list = " + list);
    }

    @Test
    public void testGetStudentById8() {
        Set<Long> set = new HashSet<>();
        set.add(1L);
        set.add(2L);
        List<StudentDO> list = studentDao.getStudentById8(set);
        System.out.println("list = " + list);
    }

    @Test
    public void testGetStudentById9() {
        Map<Long, Long> map = new HashMap<>();
        map.put(1L, 1L);
        map.put(2L, 2L);
        List<StudentDO> list = studentDao.getStudentById9(map);
        System.out.println("list = " + list);
    }




}
