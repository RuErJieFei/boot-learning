package com.yy.bootconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:bean.xml"})
@Slf4j
public class BootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootConfigApplication.class, args);
        log.info("服务启动成功");
    }

}
