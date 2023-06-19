package com.icyrain11.demo.common;

import com.icyrain11.demo.constant.HttpStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 返回结果集
 *
 * @author icyrain11
 * @version 1.8
 */
@Data
@NoArgsConstructor
public class Result<T> implements Serializable {


    /**
     * 成功
     */
    public static final int SUCCESS = 200;

    /**
     * 失败
     */
    public static final int FAIL = 500;

    private int code;

    private String msg;

    private T data;

    public static <T> Result<T> success() {
        return restResult(null, SUCCESS, "操作成功");
    }

    public static <T> Result<T> success(T data) {
        return restResult(data, SUCCESS, "操作成功");
    }

    public static <T> Result<T> success(String msg) {
        return restResult(null, SUCCESS, msg);
    }

    public static <T> Result<T> success(String msg, T data) {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> Result<T> fail() {
        return restResult(null, FAIL, "操作失败");
    }

    public static <T> Result<T> fail(String msg) {
        return restResult(null, FAIL, msg);
    }

    public static <T> Result<T> fail(T data) {
        return restResult(data, FAIL, "操作失败");
    }

    public static <T> Result<T> fail(String msg, T data) {
        return restResult(data, FAIL, msg);
    }

    public static <T> Result<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }

    /**
     * 返回警告消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static <T> Result<T> warn(String msg) {
        return restResult(null, HttpStatus.WARN, msg);
    }

    /**
     * 返回警告消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static <T> Result<T> warn(String msg, T data) {
        return restResult(data, HttpStatus.WARN, msg);
    }

    private static <T> Result<T> restResult(T data, int code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }

    public static <T> Boolean isError(Result<T> ret) {
        return !isSuccess(ret);
    }

    public static <T> Boolean isSuccess(Result<T> ret) {
        return Result.SUCCESS == ret.getCode();
    }

}
