package com.yy.bootconfig.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Slf4j
class TestBeanServiceTest {
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void testLoadService() {
        if (ioc.containsBean("testBeanService")) {
            TestBeanService testBeanService = (TestBeanService) ioc.getBean("testBeanService");
            log.info("testBeanService name: {}", testBeanService.getName());
            Assertions.assertEquals("SpringBoot", testBeanService.getName());
        }

        if (ioc.containsBean("testBeanService1")) {
            TestBeanService testBeanService = (TestBeanService) ioc.getBean("testBeanService1");
            log.info("testBeanService1 name: {}", testBeanService.getName());
        }

    }
}