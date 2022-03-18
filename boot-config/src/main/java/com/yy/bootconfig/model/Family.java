package com.yy.bootconfig.model;


import com.yy.bootconfig.util.MixPropertySourceFactory;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Data
@Component
@Validated
// 配置整体的前缀
@ConfigurationProperties(prefix = "family")
@PropertySource(value = {"classpath:family.yml"},factory = MixPropertySourceFactory.class)
public class Family {
    @Length(min = 5, max = 20, message = "家庭名称必须在5到20之间")
    private String familyName;
    private Father father;
    private Mother mother;
    private Child child;
}

