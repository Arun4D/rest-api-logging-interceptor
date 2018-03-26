package com.ad.logging.exception;

public class AuditLoggingException extends RuntimeException {
    private static final long serialVersionUID = 4269316494280751012L;

    public AuditLoggingException(final String message) {
        super(message);
    }

    public AuditLoggingException(final String message, final Throwable throwable) {
        super(message, throwable);
    }
}
