package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * StudentDao
 *
 * @author ascend
 * @date 2018/6/11 17:07.
 */
@Repository
public interface StudentDao {
    /**
     * 根据id查找
     *
     * @param id Long
     * @return Student
     */
    Student findStudentById(Long id);
}
