package com.yy.bootconfig.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @author yy
 * @date 2022/3/14 3:40 下午
 */
@Data
@Configuration
@PropertySource(name = "employeeProperties", value = {"classpath:employee.properties"})
public class Employee {

    @Value(value = "#{'${employee.names}'.split(',')}")
    private List<String> employeeNames;

    @Value(value = "#{'${employee.names}'.split(',')[0]}")
    private String firstName;

    @Value("#{${employee.age}}")
    private Map<String, Integer> employeeAge;

    @Value("#{${employee.age}.get('four') != null ? ${employee.age}.get('four') : 80}")
    private Integer ageWithDefaultValue;

    @Value("#{systemProperties['java.home']}")
    private String javaHome;

    @Value("#{systemProperties['user.dir']}")
    private String userDir;
}
