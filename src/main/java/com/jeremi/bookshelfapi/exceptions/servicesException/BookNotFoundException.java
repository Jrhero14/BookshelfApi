package com.jeremi.bookshelfapi.exceptions.servicesException;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message) {
        super(message);
    }
}
