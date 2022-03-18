package com.yy.bootconfig;

import com.yy.bootconfig.model.Family;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


/**
 * JUnit5 测试
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
class FamilyTest {

    @Autowired
    private Family family;

    @Test
    void printFamily() {
        System.out.println(family);
    }
}