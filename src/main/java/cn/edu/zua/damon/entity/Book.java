package cn.edu.zua.damon.entity;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Book
 *
 * @author ascend
 */
public class Book implements Serializable {
    private static final long serialVersionUID = 2890919381220722182L;

    public Book() {
    }

    /**
     * 主键
     */
    private Long id;
    /**
     * ISBN码
     */
    private String isbn;
    /**
     * 封面
     */
    private String frontCover;
    /**
     * 书名
     */
    private String title;
    /**
     * 简写书名
     */
    private String subtitle;
    /**
     * decimal(8,4) 单位：元
     */
    private BigDecimal originalPrice;
    /**
     * decimal(8,4) 单位：元
     */
    private BigDecimal marketPrice;
    /**
     * 简介
     */
    private String introduction;
    /**
     * 装订方式
     */
    private String bindingType;
    /**
     * 页码
     */
    private Integer pages;
    /**
     * 作者
     */
    private String author;
    /**
     * 出版社
     */
    private String publisher;
    /**
     * 目录
     */
    private String catalog;
    /**
     * 库存
     */
    private Integer supply;
    /**
     * 是否上架，缺省0 1:上架 0:下架
     */
    private Boolean bookStatus;
    /**
     * 书籍的热度
     */
    private Integer hot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFrontCover() {
        return frontCover;
    }

    public void setFrontCover(String frontCover) {
        this.frontCover = frontCover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Integer getSupply() {
        return supply;
    }

    public void setSupply(Integer supply) {
        this.supply = supply;
    }

    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
