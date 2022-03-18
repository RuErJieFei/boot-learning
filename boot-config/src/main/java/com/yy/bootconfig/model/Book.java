package com.yy.bootconfig.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import java.util.Date;

/**
 * @author yy
 * @date 2022/3/14 2:14 下午
 */
@Data
public class Book {

    private String name;

    @Min(400)
    private Integer price;

    @Future
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date publicTime;
}
