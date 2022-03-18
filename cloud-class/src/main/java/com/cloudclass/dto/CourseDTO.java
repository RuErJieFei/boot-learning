package com.cloudclass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yy
 * @date 2022/3/18 13:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDTO {
    private Integer page = 0;
    private Integer size = 10;
    private Integer role;
    private Integer type;
}
