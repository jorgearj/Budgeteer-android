package com.jaraujo.budgeteer.exceptions;

/**
 * Created by jaraujo on 06/09/2016.
 */
public class ReadDataException extends Exception {
    public ReadDataException() {
    }

    public ReadDataException(String message) {
        super(message);
    }

    public ReadDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadDataException(Throwable cause) {
        super(cause);
    }
}
