package com.cloudclass.service;

import com.cloudclass.common.RestResult;
import com.cloudclass.dto.CourseAddDTO;
import com.cloudclass.dto.CourseDTO;
import com.cloudclass.dto.CourseUpdateDTO;
import com.cloudclass.entity.TCourseEntity;
import com.cloudclass.vo.CourseVO;

import java.util.List;

/**
 * @author yy
 * @date 2022/3/18 13:18
 */
public interface CourseService {
    /**
     * 查询
     *
     * @param courseDTO
     * @return
     */
    RestResult<List<CourseVO>> getList(CourseDTO courseDTO);


    /**
     * 创建班课
     *
     * @param courseAddDTO
     * @return
     */
    RestResult add(CourseAddDTO courseAddDTO);

    /**
     * 更新
     *
     * @param courseUpdateDTO
     * @return
     */
    RestResult update(CourseUpdateDTO courseUpdateDTO);


    /**
     * 删除
     *
     * @param id
     * @return
     */
    RestResult delete(Integer id);


}
