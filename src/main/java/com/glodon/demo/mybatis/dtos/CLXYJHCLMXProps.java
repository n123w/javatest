package com.glodon.demo.mybatis.dtos;

import java.math.BigDecimal;
import java.util.Date;

public class CLXYJHCLMXProps {
    private Long id;
    private Long clxyjhid;
    private Long clzdid;
    private String dw;
    private Long bwmcid;
    private Long bwmc;
    private String bwmcfulldesc;
    private BigDecimal jhl;
    private Date jhrq;
    private String zlyq;
    private String pp;
    private String ghdd;
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClxyjhid() {
        return clxyjhid;
    }

    public void setClxyjhid(Long clxyjhid) {
        this.clxyjhid = clxyjhid;
    }

    public Long getClzdid() {
        return clzdid;
    }

    public void setClzdid(Long clzdid) {
        this.clzdid = clzdid;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public Long getBwmcid() {
        return bwmcid;
    }

    public void setBwmcid(Long bwmcid) {
        this.bwmcid = bwmcid;
    }

    public Long getBwmc() {
        return bwmc;
    }

    public void setBwmc(Long bwmc) {
        this.bwmc = bwmc;
    }

    public String getBwmcfulldesc() {
        return bwmcfulldesc;
    }

    public void setBwmcfulldesc(String bwmcfulldesc) {
        this.bwmcfulldesc = bwmcfulldesc;
    }

    public BigDecimal getJhl() {
        return jhl;
    }

    public void setJhl(BigDecimal jhl) {
        this.jhl = jhl;
    }

    public Date getJhrq() {
        return jhrq;
    }

    public void setJhrq(Date jhrq) {
        this.jhrq = jhrq;
    }

    public String getZlyq() {
        return zlyq;
    }

    public void setZlyq(String zlyq) {
        this.zlyq = zlyq;
    }

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public String getGhdd() {
        return ghdd;
    }

    public void setGhdd(String ghdd) {
        this.ghdd = ghdd;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
