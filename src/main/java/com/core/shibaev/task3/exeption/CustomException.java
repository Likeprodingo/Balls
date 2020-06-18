package com.core.shibaev.task3.exeption;

public class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
