package com.cloudclass.controller;

import com.cloudclass.common.RestResult;
import com.cloudclass.dto.CourseAddDTO;
import com.cloudclass.dto.CourseDTO;
import com.cloudclass.dto.CourseUpdateDTO;
import com.cloudclass.entity.TCourseEntity;
import com.cloudclass.service.CourseService;
import com.cloudclass.vo.CourseVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yy
 * @date 2022/3/18 13:46
 */
@RestController
@RequestMapping()
public class CourseController {
    @Resource
    private CourseService courseService;

    @GetMapping("/index")
    RestResult<List<CourseVO>> getList(@RequestBody CourseDTO courseDTO) {
        return courseService.getList(courseDTO);
    }

    @PostMapping("/clazz")
    RestResult add(@RequestBody CourseAddDTO courseAddDTO) {
        return courseService.add(courseAddDTO);
    }

    @PutMapping("/clazz")
    RestResult add(@RequestBody CourseUpdateDTO courseUpdateDTO) {
        return courseService.update(courseUpdateDTO);
    }

    @DeleteMapping("/clazz")
    RestResult add(@RequestParam Integer id) {
        return courseService.delete(id);
    }
}
