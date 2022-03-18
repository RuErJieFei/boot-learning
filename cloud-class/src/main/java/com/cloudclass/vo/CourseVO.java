package com.cloudclass.vo;

import com.cloudclass.entity.TCourseEntity;
import com.cloudclass.entity.TUserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yy
 * @date 2022/3/18 16:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseVO {
    TCourseEntity course;
    TUserEntity creater;
}
