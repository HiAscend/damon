package cn.edu.zua.damon.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Article
 *
 * @author ascend
 * @date 2018/5/22 17:23.
 */
public class Article implements Serializable {
    private static final long serialVersionUID = 8680804983633158833L;

    /**
     * 主键
     */
    private BigInteger id;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 创建时间
     */
    private String articleCreateDate;
    /**
     * 文章内容
     */
    private String articleContent;
    /**
     * 置顶类型缺省0，1:置顶 ，0:非置顶
     */
    private Boolean topType;
    /**
     * 添加人
     */
    private String addName;

    public Article() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleCreateDate() {
        return articleCreateDate;
    }

    public void setArticleCreateDate(String articleCreateDate) {
        this.articleCreateDate = articleCreateDate;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Boolean getTopType() {
        return topType;
    }

    public void setTopType(Boolean topType) {
        this.topType = topType;
    }

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
