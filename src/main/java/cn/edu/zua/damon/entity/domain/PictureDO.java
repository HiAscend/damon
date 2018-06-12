package cn.edu.zua.damon.entity.domain;

import cn.edu.zua.damon.util.MyReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * PictureDO
 *
 * @author ascend
 * @date 2018/5/30 11:25.
 */
public class PictureDO implements Serializable {
    private static final long serialVersionUID = 4596583377813876503L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 图片地址
     */
    private String path;

    /**
     * 图片类型
     */
    private int pictureType;

    /**
     * 目标地址
     */
    private String targetUrl;

    /**
     * 图片评分
     */
    private Integer grade;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 记录修改时间
     */
    private Date gmtModified;

    public PictureDO() {
        // 默认构造函数
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPictureType() {
        return pictureType;
    }

    public void setPictureType(int pictureType) {
        this.pictureType = pictureType;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
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
