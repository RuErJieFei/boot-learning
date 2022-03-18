package com.yy.bootquickstart.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yy
 * @date 2022/3/7 4:25 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private String name;

    private Integer id;
}
