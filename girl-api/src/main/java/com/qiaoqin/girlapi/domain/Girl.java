package com.qiaoqin.girlapi.domain;

import javax.validation.constraints.Min;
import java.io.Serializable;

public class Girl implements Serializable{

    private Integer id;

    private String cupSize;

    @Min(value = 18,message = "未成年")
    private Integer age;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    private Name name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Girl() {
    }

}
