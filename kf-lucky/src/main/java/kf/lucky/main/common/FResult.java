package kf.lucky.main.common;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class FResult<T> implements Serializable {
    private int Status;
    private String message;
    boolean success;
    private T data;
    Date time;

    private static <T> FResult<T> restResult(T data, int code, boolean success, String msg) {
        FResult fResult = new FResult();
        fResult.setData(data);
        fResult.setStatus(code);
        fResult.setSuccess(success);
        fResult.setMessage(msg);
        fResult.setTime(new Date());
        return fResult;
    }

    public static <T> FResult<T> ok() {
        return restResult(null, FConstants.SUCCESS, true, FConstants.MSG_SUCCESS);
    }

    public static <T> FResult<T> ok(T data) {
        return restResult(data, FConstants.SUCCESS, true, FConstants.MSG_SUCCESS);
    }
}
