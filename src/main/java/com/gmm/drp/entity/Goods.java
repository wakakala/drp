package com.gmm.drp.entity;

import org.apache.ibatis.annotations.Insert;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName Goods
 * @Description
 * @Author baohaipeng
 * @Date
 * @Version 1.0
 */
public class Goods implements Serializable {
    private Integer id;

    private String gname;

    private String gadd;

    private String gimg;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date saletime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date shelftime;

    private String gdesc;

    private Boolean iseventmer;

    private String price;

    private Integer sequence;

    private BigDecimal marketprice;

    private Integer gstock;

    private Integer issale;

    private String grad;

    private String deliverytime;

    private String cats;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGadd() {
        return gadd;
    }

    public void setGadd(String gadd) {
        this.gadd = gadd == null ? null : gadd.trim();
    }

    public String getGimg() {
        return gimg;
    }

    public void setGimg(String gimg) {
        this.gimg = gimg == null ? null : gimg.trim();
    }

    public Date getSaletime() {
        return saletime;
    }

    public void setSaletime(Date saletime) {
        this.saletime = saletime;
    }

    public Date getShelftime() {
        return shelftime;
    }

    public void setShelftime(Date shelftime) {
        this.shelftime = shelftime;
    }

    public String getGdesc() {
        return gdesc;
    }

    public void setGdesc(String gdesc) {
        this.gdesc = gdesc == null ? null : gdesc.trim();
    }

    public Boolean getIseventmer() {
        return iseventmer;
    }

    public void setIseventmer(Boolean iseventmer) {
        this.iseventmer = iseventmer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public BigDecimal getMarketprice() {
        return marketprice;
    }

    public void setMarketprice(BigDecimal marketprice) {
        this.marketprice = marketprice;
    }

    public Integer getGstock() {
        return gstock;
    }

    public void setGstock(Integer gstock) {
        this.gstock = gstock;
    }

    public Integer getIssale() {
        return issale;
    }

    public void setIssale(Integer issale) {
        this.issale = issale;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad == null ? null : grad.trim();
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime == null ? null : deliverytime.trim();
    }

    public String getCats() {
        return cats;
    }

    public void setCats(String cats) {
        this.cats = cats == null ? null : cats.trim();
    }

}
