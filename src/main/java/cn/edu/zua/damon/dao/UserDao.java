package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * UserDao
 *
 * @author ascend
 * @date 2018/5/28 11:02.
 */
@Repository
public interface UserDao {
    /**
     * 登录
     *
     * @param user User
     * @return User
     */
    User login(User user);

    /**
     * 查找用户列表
     *
     * @param map Map
     * @return List
     */
    List<User> findUsers(Map<String, Object> map);

    /**
     * 查询用户总数
     *
     * @param map Map
     * @return Long
     */
    Long getTotalUser(Map<String, Object> map);

    /**
     * 修改用户
     *
     * @param user User
     * @return int 受影响的行
     */
    int updateUser(User user);

    /**
     * 添加用户
     *
     * @param user User
     * @return 受影响的行
     */
    int addUser(User user);

    /**
     * 删除用户
     *
     * @param id Long
     * @return 受影响的行
     */
    int deleteUser(Long id);
}
