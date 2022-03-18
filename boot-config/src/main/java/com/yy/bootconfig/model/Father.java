package com.yy.bootconfig.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

@Data
public class Father {
    private String name;

    @Min(value = 20, message = "爸爸年龄不小于20岁")
    private Integer age;

    @Email
    private String email;
}
