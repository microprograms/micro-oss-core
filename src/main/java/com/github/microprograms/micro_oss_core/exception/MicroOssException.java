package com.github.microprograms.micro_oss_core.exception;

public class MicroOssException extends Exception {
    private static final long serialVersionUID = 1L;

    public MicroOssException(String message) {
        super(message);
    }

    public MicroOssException(String message, Throwable cause) {
        super(message, cause);
    }
}
