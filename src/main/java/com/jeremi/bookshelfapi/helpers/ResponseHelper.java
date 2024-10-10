package com.jeremi.bookshelfapi.helpers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;

public class ResponseHelper {
    public static ResponseEntity<?> toJson(String status, String message, Object data, HttpStatus statusCode){
        return new ResponseEntity<>(new HashMap<>(){{
            put("status", status);
            put("message", message);
            put("data", data);
        }}, statusCode);
    }
}
