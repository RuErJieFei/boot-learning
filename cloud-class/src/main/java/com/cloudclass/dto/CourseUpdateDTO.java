package com.cloudclass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yy
 * @date 2022/3/18 15:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseUpdateDTO {
    private String name;
    private String coverUrl;
    private Integer status;
    private String termTitle;

    private Integer id;
}
