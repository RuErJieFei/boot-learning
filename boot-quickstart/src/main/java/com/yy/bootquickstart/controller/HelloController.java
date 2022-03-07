package com.yy.bootquickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yy
 * @date 2022/3/7 2:56 下午
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "hello world";
    }
}
