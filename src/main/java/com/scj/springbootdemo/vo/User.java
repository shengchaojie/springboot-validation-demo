package com.scj.springbootdemo.vo;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {

    @Size(min = 1,max = 10,message = "姓名长度必须为1到10")
    private String name;

    @NotEmpty
    private String firstName;

    @Min(value = 10,message = "年龄最小为10")@Max(value = 100,message = "年龄最大为100")
    private Integer age;

    @Future
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
