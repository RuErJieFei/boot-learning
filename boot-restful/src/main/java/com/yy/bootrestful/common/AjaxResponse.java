package com.yy.bootrestful.common;

import lombok.Data;

/**
 * @author yy
 * @date 2022/3/10 4:43 下午
 */
@Data
public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;

    private AjaxResponse() {
    }

    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }

    public static AjaxResponse success(Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(data);
        return ajaxResponse;
    }
}
