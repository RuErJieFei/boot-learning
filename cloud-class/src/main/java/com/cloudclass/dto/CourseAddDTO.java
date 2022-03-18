package com.cloudclass.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yy
 * @date 2022/3/18 15:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseAddDTO {
    private String name;
    private String coverUrl;
    private Integer status;

    private Integer creater;

    private String termTitle;
}
