package com.glodon.demo.mybatis.dtos;

import com.glodon.demo.mybatis.enums.JHLX;

import java.util.Date;
import java.util.List;

public class CLXYJHProps {
    private Long id;
    private String code;
    private Date bizdate;
    private JHLX jhlx;
    private String remark;

    public List<CLXYJHCLMXProps> getClmxs() {
        return clmxs;
    }

    public void setClmxs(List<CLXYJHCLMXProps> clmxs) {
        this.clmxs = clmxs;
    }

    private List<CLXYJHCLMXProps> clmxs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getBizdate() {
        return bizdate;
    }

    public void setBizdate(Date bizdate) {
        this.bizdate = bizdate;
    }

    public JHLX getJhlx() {
        return jhlx;
    }

    public void setJhlx(JHLX jhlx) {
        this.jhlx = jhlx;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
