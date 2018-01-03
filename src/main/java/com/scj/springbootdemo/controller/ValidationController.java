package com.scj.springbootdemo.controller;

import com.scj.springbootdemo.custom.HandsomeBoy;
import com.scj.springbootdemo.service.ValidateService;
import com.scj.springbootdemo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

@Controller
@Validated
public class ValidationController {

    @Autowired
    private ValidateService validateService;

    @GetMapping("/validate1")
    @ResponseBody
    public String validate1(
            @Size(min = 1,max = 10,message = "姓名长度必须为1到10")@RequestParam("name") String name,
            @Min(value = 10,message = "年龄最小为10")@Max(value = 100,message = "年龄最大为100") @RequestParam("age") Integer age,
            @RequestParam("birth")@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss") Date birth){
        validateService.testValidate("123",15,birth);
        return "validate1";
    }

    @PostMapping("/validate2")
    @ResponseBody
    public User validate2(@Valid @RequestBody User user){
        return user;
    }

    @PostMapping("/validate3")
    @ResponseBody
    public User validate3(@Valid @HandsomeBoy(name = "scj",message = "盛超杰第二帅") @RequestBody  User user){
        return user;
    }

}
