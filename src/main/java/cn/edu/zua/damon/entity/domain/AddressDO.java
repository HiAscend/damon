package cn.edu.zua.damon.entity.domain;

import cn.edu.zua.damon.util.MyReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * AddressDO
 *
 * @author ascend
 * @date 2018/6/13 17:14.
 */
public class AddressDO implements Serializable {

    private static final long serialVersionUID = -6429944175085329981L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 学生表主键
     */
    private Long studentId;

    /**
     * 学生地址
     */
    private String address;

    /**
     * 记录创建时间
     */
    private Date gmtCreate;

    /**
     * 记录修改时间
     */
    private Date gmtModified;

    public AddressDO(){
        // 默认构造
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return MyReflectionToStringBuilder.toString(this);
    }
}
