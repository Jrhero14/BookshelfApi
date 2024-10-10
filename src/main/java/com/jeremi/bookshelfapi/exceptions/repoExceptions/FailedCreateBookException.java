package com.jeremi.bookshelfapi.exceptions.repoExceptions;

public class FailedCreateBookException extends Exception {
    public FailedCreateBookException(String message) {
        super(message);
    }
}
