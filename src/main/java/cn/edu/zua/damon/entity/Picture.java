package cn.edu.zua.damon.entity;

import java.io.Serializable;

/**
 * Picture
 *
 * @author ascend
 * @date 2018/5/30 11:25.
 */
public class Picture implements Serializable {
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
    private int type;

    /**
     * 目标地址
     */
    private String targetUrl;

    /**
     * 图片评分
     */
    private int grade;

    /**
     * 创建时间
     */
    private String createTime;

    public Picture() {
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
