package com.yy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yy
 * @date 2022/3/8 9:44 下午
 */
@Configuration
public class AutoConfiguration {
    @Bean
    SnowService snowService() {
        return new SnowService();
    }
}
