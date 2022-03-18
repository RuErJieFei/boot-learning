package com.cloudclass.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yy
 * @date 2022/1/14 10:37 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestResult<T> {

    private Integer code;
    private String msg;
    private T data;

    public RestResult(T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
