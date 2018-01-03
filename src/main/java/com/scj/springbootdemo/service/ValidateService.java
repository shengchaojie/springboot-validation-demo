package com.scj.springbootdemo.service;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * 测试service层是否可以使用
 */
@Service
@Validated
public class ValidateService {

    public String testValidate(@Size(min = 1,max = 10,message = "姓名长度必须为1到10")@RequestParam("name") String name,
                               @Min(value = 10,message = "年龄最小为10")@Max(value = 100,message = "年龄最大为100") @RequestParam("age") Integer age,
                               @Future @RequestParam("birth")@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") Date birth){
        return "ok";
    }

}
