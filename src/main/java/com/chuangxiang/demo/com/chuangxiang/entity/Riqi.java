package com.chuangxiang.demo.com.chuangxiang.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Riqi {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Riqi{" +
                "date=" + date +
                '}';
    }
}
