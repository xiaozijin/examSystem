package com.demo.examSystem.entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private String sno;
    private String stuPsw;
    private String stuName;
    private String stuImgSrc;
    private String stuSex;
    private String stuEmail;
    private String stuPhone;
    private Date stuCreateTime;
    private Date stuLastLoginTime;
    private String stuStatus;
    private String stuSecurityCode;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getStuPsw() {
        return stuPsw;
    }

    public void setStuPsw(String stuPws) {
        this.stuPsw = stuPws;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuImgSrc() {
        return stuImgSrc;
    }

    public void setStuImgSrc(String stuImgSrc) {
        this.stuImgSrc = stuImgSrc;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public Date getStuCreateTime() {
        return stuCreateTime;
    }

    public void setStuCreateTime(Date stuCreateTime) {
        this.stuCreateTime = stuCreateTime;
    }

    public Date getStuLastLoginTime() {
        return stuLastLoginTime;
    }

    public void setStuLastLoginTime(Date stuLastLoginTime) {
        this.stuLastLoginTime = stuLastLoginTime;
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }

    public String getStuSecurityCode() {
        return stuSecurityCode;
    }

    public void setStuSecurityCode(String stuSecurityCode) {
        this.stuSecurityCode = stuSecurityCode;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", stuPws='" + stuPsw + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuImgSrc='" + stuImgSrc + '\'' +
                ", stuEmail='" + stuEmail + '\'' +
                ", stuPhone='" + stuPhone + '\'' +
                ", stuCreateTime=" + stuCreateTime +
                ", stuLastLoginTime=" + stuLastLoginTime +
                ", stuStatus='" + stuStatus + '\'' +
                ", stuSecurityCode='" + stuSecurityCode + '\'' +
                '}';
    }
}
