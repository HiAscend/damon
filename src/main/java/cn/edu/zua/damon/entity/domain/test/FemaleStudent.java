package cn.edu.zua.damon.entity.domain.test;

import cn.edu.zua.damon.util.MyReflectionToStringBuilder;

/**
 * FemaleStudent
 *
 * @author ascend
 * @date 2018/6/14 11:34.
 */
public class FemaleStudent extends StudentDO {
    private static final long serialVersionUID = -2901191567467348981L;

    /**
     * 性别
     */
    private Integer gender;

    public FemaleStudent() {
        // 空构造
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return MyReflectionToStringBuilder.toString(this);
    }
}
