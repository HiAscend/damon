package cn.edu.zua.damon.entity.domain.test;

import cn.edu.zua.damon.util.MyReflectionToStringBuilder;

/**
 * MaleStudent
 *
 * @author ascend
 * @date 2018/6/14 11:27.
 */
public class MaleStudent extends StudentDO {

    private static final long serialVersionUID = -2313113325956472502L;

    /**
     * 性别
     */
    private Integer sexuality;

    public MaleStudent(){
        // 空构造
    }

    public Integer getSexuality() {
        return sexuality;
    }

    public void setSexuality(Integer sexuality) {
        this.sexuality = sexuality;
    }

    @Override
    public String toString() {
        return MyReflectionToStringBuilder.toString(this);
    }
}
