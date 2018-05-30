package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.UserInfo;
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
public interface UserInfoDao {
    /**
     * 登录
     *
     * @param userInfo UserInfo
     * @return UserInfo
     */
    UserInfo login(UserInfo userInfo);

    /**
     * 查找用户列表
     *
     * @param map Map
     * @return List
     */
    List<UserInfo> findUserInfos(Map<String, Object> map);

    /**
     * 查询用户总数
     *
     * @param map Map
     * @return Long
     */
    Long getTotalUserInfo(Map<String, Object> map);

    /**
     * 修改用户
     *
     * @param userInfo UserInfo
     * @return int 受影响的行
     */
    int updateUserInfo(UserInfo userInfo);

    /**
     * 添加用户
     *
     * @param userInfo UserInfo
     * @return 受影响的行
     */
    int addUserInfo(UserInfo userInfo);

    /**
     * 删除用户
     *
     * @param id Long
     * @return 受影响的行
     */
    int deleteUserInfo(Long id);
}
