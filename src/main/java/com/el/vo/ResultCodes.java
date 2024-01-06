package com.el.vo;

import org.springframework.http.HttpStatus;

/**
 * @Description: 结果编码(默认使用 Http 协议定义的状态) 如需要自定义编码从 1XXX 开始
 */
public enum ResultCodes {

    /**
     * 响应成功
     */
    SUCCESS(HttpStatus.OK),
    /**
     * 参数错误，无效请求
     */
    BAD_REQUEST(HttpStatus.BAD_REQUEST),

            ;

    private final int value;

    private final String description;

    ResultCodes(int value, String description) {
        this.value = value;
        this.description = description;
    }

    ResultCodes(HttpStatus httpStatus) {
        this.value = httpStatus.value();
        this.description = httpStatus.getReasonPhrase();
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
