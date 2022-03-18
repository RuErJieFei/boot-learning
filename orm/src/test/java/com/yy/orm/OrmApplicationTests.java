package com.yy.orm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class OrmApplicationTests {

    @Resource
    private ArticleDao articleDao;

    @Test
    void save() {
        Article article = Article.builder()
                .id(1002)
                .author("yy")
                .title("Python")
                .content("123")
                .createTime(new Date())
                .build();
        int rows = articleDao.save(article);
        assertEquals(1, rows);
    }

    @Test
    void deleteById() {
    }

    @Test
    void updateById() {
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

}
