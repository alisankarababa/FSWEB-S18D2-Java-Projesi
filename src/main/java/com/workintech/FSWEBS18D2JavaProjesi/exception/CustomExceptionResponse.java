package com.workintech.FSWEBS18D2JavaProjesi.exception;

import lombok.Data;

@Data
public class CustomExceptionResponse {

    private String message;
    private long timestamp;

    public CustomExceptionResponse(String message, long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }
}
