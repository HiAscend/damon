package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.domain.StudentDO;
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
     * @return StudentDO
     */
    StudentDO getStudentById(Long id);
}
