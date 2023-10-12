package com.fdemo.fdemo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code;//code 200 代表成功; 404 代表失败
    private String msg;  //message "success" "not found"
    private Object data; //data

    /**
     * success
     * @return
     */
    public static Result success() {
        return new Result(200, "success", null);
    }

    public static Result success(Object data) {
        return new Result(200, "success", data);
    }

    public static Result error(String msg) {
        return new Result(404, msg, null);
    }
}
