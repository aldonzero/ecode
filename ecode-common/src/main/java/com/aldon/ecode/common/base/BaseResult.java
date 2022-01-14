package com.aldon.ecode.common.base;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * 数据封装返回
 *
 * @author aldon
 */
@Data
@ToString(callSuper = true)
//@EqualsAndHashCode(callSuper = true)
public class BaseResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 是否成功
     */
    private Boolean success = false;

    /**
     * 响应时间戳
     */
    private String timestamp;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 初始化一个新创建的 BaseResult 对象，使其表示一个空消息
     */
    public BaseResult() {
    }

    /**
     * 初始化一个新创建的 BaseResult 对象
     *
     * @param code    状态码
     * @param msg     返回内容
     * @param success 成功状态
     */
    public BaseResult(Integer code, String msg, Boolean success) {
        this.code = code;
        this.message = msg;
        this.success = success;
    }

    /**
     * 初始化一个新创建的 BaseResult 对象
     *
     * @param success 成功状态
     */
    public BaseResult(Boolean success) {
        this.success = success;
    }

    /**
     * 初始化一个新创建的 BaseResult 对象
     *
     * @param success 成功状态
     * @param message 返回消息
     */
    public BaseResult(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    /**
     * 初始化一个新创建的 BaseResult 对象
     *
     * @param code    状态码
     * @param message 返回消息
     */
    public BaseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 初始化一个新创建的 BaseResult 对象
     *
     * @param success 成功提示
     * @param message 返回消息
     * @param data    数据对象
     */
    public BaseResult(Boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    /**
     * 初始化一个新创建的 BaseResult 对象
     *
     * @param code    状态码
     * @param success 成功提示
     * @param message 返回消息
     * @param data    数据对象
     */
    public BaseResult(Integer code, String message, Boolean success, T data) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.data = data;
    }


    /**
     * 初始化一个新创建的 BaseResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param data 数据对象
     */
    public BaseResult(Integer code, String msg, T data) {
        this.code = code;
        this.message = msg;
        this.data = data;
    }


    /**
     * 返回成功消息
     *
     * @param <T> 数据对象
     * @return 成功消息
     */
    public static <T> BaseResult<T> ok() {
        return ok(200, "操作成功");
    }

    /**
     * 携带数据返回成功消息
     *
     * @param <T>  数据对象
     * @param data 返回消息
     * @return 数据对象
     */
    public static <T> BaseResult<T> ok(T data) {
        return new BaseResult<T>(200, "操作成功", true, data);
    }

    /**
     * 返回成功消息
     *
     * @param <T>  数据对象
     * @param code 状态码
     * @param msg  返回内容
     * @return 成功消息
     */
    public static <T> BaseResult<T> ok(Integer code, String msg) {
        return new BaseResult<>(code, msg, true, null);
    }

    /**
     * 携带数据返回成功消息
     *
     * @param <T>  数据对象
     * @param msg  返回消息
     * @param data 数据载体
     * @return 封装的数据
     */
    public static <T> BaseResult<T> ok(String msg, T data) {
        return new BaseResult<>(200, msg, true, data);
    }

    /**
     * 返回失败消息
     *
     * @param <T> 数据对象
     * @param notFound
     * @param 查询结果为空
     * @return 失败消息
     */
    public static <T> BaseResult<T> fail(HttpStatus notFound, String 查询结果为空) {
        return fail(500, "操作失败");
    }

    /**
     * 返回失败消息
     *
     * @param <T> 数据对象
     * @param msg 返回消息
     * @return 失败消息
     */
    public static <T> BaseResult<T> fail(String msg) {
        return fail(500, msg);
    }

    /**
     * 返回错误消息
     *
     * @param <T>  数据对象
     * @param code 响应状态码
     * @param msg  响应消息
     * @return 错误消息
     */
    public static <T> BaseResult<T> fail(Integer code, String msg) {
        return new BaseResult<>(code, msg, false, null);
    }

    /**
     * 返回错误消息
     *
     * @param <T>  数据对象
     * @param msg  响应消息
     * @param data 响应失败的消息体
     * @return 错误消息
     */
    public static <T> BaseResult<T> fail(String msg, T data) {
        return new BaseResult<>(400, msg, false, data);
    }

    /**
     * 返回错误消息
     *
     * @param <T>  数据对象
     * @param code 响应状态码
     * @param msg  响应消息
     * @param data 响应失败的消息体
     * @return 错误消息
     */
    public static <T> BaseResult<T> fail(Integer code, String msg, T data) {
        return new BaseResult<>(code, msg, false, data);
    }

    /**
     * 返回成功消息
     *
     * @param <T> 数据对象
     * @return 成功消息
     */
    public static <T> BaseResult<T> success() {
        return BaseResult.success(200, "操作成功");
    }

    /**
     * 携带数据返回成功消息
     *
     * @param <T>  数据对象
     * @param data 封装返回的数据对象
     * @return 成功消息
     */
    public static <T> BaseResult<T> success(T data) {
        return BaseResult.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param <T>  数据对象
     * @return 成功消息
     */
    public static <T> BaseResult<T> success(Integer code, String msg) {
        return new BaseResult<>(code, msg, true, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg  返回内容
     * @param data 数据对象
     * @param <T>  数据对象
     * @return 成功消息
     */
    public static <T> BaseResult<T> success(String msg, T data) {
        return new BaseResult<>(200, msg, true, data);
    }

    /**
     * 返回错误消息
     *
     * @param <T> 数据对象
     * @return 错误消息
     */
    public static <T> BaseResult<T> error() {
        return BaseResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @param <T> 数据对象
     * @return 警告消息
     */
    public static <T> BaseResult<T> error(String msg) {
        return BaseResult.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param <T>  数据对象
     * @param msg  返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static <T> BaseResult<T> error(String msg, T data) {
        return new BaseResult<>(500, msg, false, data);
    }

    /**
     * 返回错误消息
     *
     * @param <T>  数据对象
     * @param msg  返回内容
     * @param data 数据对象
     * @param code 状态码
     * @return 警告消息
     */
    public static <T> BaseResult<T> error(Integer code, String msg, T data) {
        return new BaseResult<>(code, msg, false, data);
    }

    /**
     * 返回错误消息
     *
     * @param <T>  数据对象
     * @param code 状态码
     * @param msg  返回内容
     * @return 警告消息
     */
    public static <T> BaseResult<T> error(Integer code, String msg) {
        return new BaseResult<>(code, msg, false, null);
    }

    /**
     * 封装数据并返回一个BaseResult实例
     *
     * @param data 数据
     * @return BaseResult实例
     */
    public BaseResult<T> setResult(T data) {
        this.data = data;
        return this;
    }

}
