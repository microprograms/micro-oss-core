package com.github.microprograms.micro_oss_core.exception;

import java.io.IOException;

public class MicroOssException extends IOException {
    private static final long serialVersionUID = 1L;

    public MicroOssException(String message) {
        super(message);
    }

    public MicroOssException(Throwable cause) {
        super(cause);
    }

    public MicroOssException(String message, Throwable cause) {
        super(message, cause);
    }
}
