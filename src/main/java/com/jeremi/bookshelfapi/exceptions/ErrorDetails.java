package com.jeremi.bookshelfapi.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class ErrorDetails {
    @Getter
    @Setter
    private String status;

    @Getter
    @Setter
    private Object message;

    @Getter
    @Setter
    private Date timestamp;

    public ErrorDetails(String status, Object message, Date timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
}
