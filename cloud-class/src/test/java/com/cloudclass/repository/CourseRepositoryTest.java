package com.cloudclass.repository;

import com.cloudclass.entity.TCourseEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class CourseRepositoryTest {
    @Resource
    private CourseRepository courseRepository;

    @Test
    void getList() {
        List<TCourseEntity> all = courseRepository.findAll();
        all.forEach(System.out::println);
    }

}