package com.github.microprograms.micro_oss_core.exception;

public class MicroOssTransactionException extends Exception {
    private static final long serialVersionUID = 1L;

    public MicroOssTransactionException(String message) {
        super(message);
    }

    public MicroOssTransactionException(Throwable cause) {
        super(cause);
    }

    public MicroOssTransactionException(String message, Throwable cause) {
        super(message, cause);
    }
}
