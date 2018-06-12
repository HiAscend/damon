package cn.edu.zua.damon.entity.domain;

import cn.edu.zua.damon.util.MyReflectionToStringBuilder;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * StudentDO
 *
 * @author ascend
 * @date 2018/6/11 16:39.
 */
public class StudentDO implements Serializable {

    private static final long serialVersionUID = 5797977328960228758L;

    public StudentDO() {
        // 空构造
    }

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 年龄
     */
    private int age;

    /**
     * 记录创建时间
     */
    private Date gmtCreate;

    /**
     * 记录修改时间
     */
    private Date gmtModified;

    /**
     * 日期
     */
    private LocalDate date;

    /**
     * 时间
     */
    private LocalTime time;

    /**
     * 日期时间
     */
    private LocalDateTime datetime;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return MyReflectionToStringBuilder.toString(this);
    }
}
