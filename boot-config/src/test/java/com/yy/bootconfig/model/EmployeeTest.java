package com.yy.bootconfig.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.HashMap;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class EmployeeTest {
    @Resource
    private Employee employee;

    @Test
    void name() {
        System.out.println(employee.getEmployeeNames());

        employee.getEmployeeAge().forEach((key, value) -> System.out.println(key + " -> " + value));

        System.out.println(employee.getAgeWithDefaultValue());

        System.out.println(employee.getJavaHome());
        System.out.println(employee.getUserDir());
    }
}