package com.example.test.controller;

import com.yy.SnowService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yy
 * @date 2022/3/7 2:56 下午
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    SnowService snowService;

    @GetMapping
    public String hello() {
        return "随机生成雪花ID" + snowService.getSnow();
    }
}
