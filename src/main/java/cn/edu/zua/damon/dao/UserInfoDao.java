package cn.edu.zua.damon.dao;

import cn.edu.zua.damon.entity.domain.UserInfoDO;
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
     * @param userInfo UserInfoDO
     * @return UserInfoDO
     */
    UserInfoDO login(UserInfoDO userInfo);

    /**
     * 查找用户列表
     *
     * @param map Map
     * @return List
     */
    List<UserInfoDO> listUserInfos(Map<String, Object> map);

    /**
     * 查询用户总数
     *
     * @param map Map
     * @return Long
     */
    Long countTotalUserInfo(Map<String, Object> map);

    /**
     * 修改用户
     *
     * @param userInfo UserInfoDO
     * @return int 受影响的行
     */
    int updateUserInfo(UserInfoDO userInfo);

    /**
     * 添加用户
     *
     * @param userInfo UserInfoDO
     * @return 受影响的行
     */
    int insertUserInfo(UserInfoDO userInfo);

    /**
     * 删除用户
     *
     * @param id Long
     * @return 受影响的行
     */
    int deleteUserInfo(Long id);
}
