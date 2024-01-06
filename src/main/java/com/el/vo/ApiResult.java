
package com.el.vo;




import java.io.Serializable;

public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = -7202943016570124163L;
    private Integer code;
    private T data;
    private String message;

    public ApiResult() {
    }

    public ApiResult(Integer code) {
        this(code, (T)null, (String)null);
    }

    public ApiResult(Integer code, T data) {
        this(code, data, (String)null);
    }

    public ApiResult(Integer code, String message) {
        this(code, (T)null, message);
    }

    public ApiResult(Integer code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public static <T> ApiResult<T> success() {
        return success((T)null, "success");
    }

    public static <T> ApiResult<T> success(T data) {
        return success(data, "success");
    }

//    public static <T> ApiResult<T> success(String message) {
//        return success((T)null, message);
//    }

    public static <T> ApiResult<T> success(T data, String message) {
        return new ApiResult(ResultCodes.SUCCESS.getValue(), data, message);
    }

    public static <T> ApiResult<T> fail(Integer code) {
        return fail(code, (T)null, "failed");
    }

    public static <T> ApiResult<T> fail(Integer code, T data) {
        return fail(code, data, "failed");
    }

    public static <T> ApiResult<T> fail(Integer code, String message) {
        return fail(code, (T)null, message);
    }

    public static <T> ApiResult<T> fail(Integer code, T data, String message) {
        return new ApiResult(code, data, message);
    }

    public static <T> ApiResult<T> fail(ResultCodes codes) {
        return fail(codes.getValue(), (T)null, codes.getDescription());
    }
    public Integer getCode() {
        return this.code;
    }

    public T getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public void setMessage(final String message) {
        this.message = message;
    }


}
