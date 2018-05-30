package cn.edu.zua.damon.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * UserInfo
 *
 * @author ascend
 * @date 2018/5/28 11:03.
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 2740544421155496415L;
    /**
     * 主键，自增
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 加密后的密码
     */
    private String passWord;

    /**
     * 用户角色，系统管理员，普通管理员
     */
    private String roleName;

    public UserInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
