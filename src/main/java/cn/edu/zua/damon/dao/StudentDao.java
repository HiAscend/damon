package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.domain.test.StudentDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

    /**
     * 根据id查找2
     *
     * @param id Long
     * @return StudentDO
     */
    Map<String, Object> getStudentById2(Long id);

    /**
     * 根据id查找3
     *
     * @param id Long
     * @return StudentDO
     */
    StudentDO getStudentById3(Long id);

    /**
     * 根据id查找4,附带地址信息
     *
     * @param id Long
     * @return StudentDO
     */
    StudentDO getStudentById4(Long id);

    /**
     * 根据id查找5,附带地址信息
     *
     * @param id Long
     * @return StudentDO
     */
    StudentDO getStudentById5(Long id);

    /**
     * 根据id查找6
     *
     * @param id Long
     * @return StudentDO
     */
    StudentDO getStudentById6(Long id);

    /**
     * 根据id查找7
     *
     * @param list List
     * @return StudentDO
     */
    List<StudentDO> getStudentById7(List<Long> list);

    /**
     * 根据id查找8
     *
     * @param set Set
     * @return StudentDO
     */
    List<StudentDO> getStudentById8(Set<Long> set);

    /**
     * 根据id查找9
     *
     * @param map Map
     * @return StudentDO
     */
    List<StudentDO> getStudentById9(@Param("myMap") Map<Long, Long> map);

}
