package com.flaming.common.struct.exception;

/**
 * 未实现方法异常
 *
 * @Author: Flaming
 * @Time: 2020-01-12 23:34
 */
public class UnImplementException extends Exception {

    public UnImplementException() {
        super();
    }

    public UnImplementException(String message) {
        super(message);
    }

    public UnImplementException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnImplementException(Throwable cause) {
        super(cause);
    }

    protected UnImplementException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
