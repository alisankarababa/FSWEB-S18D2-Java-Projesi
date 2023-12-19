package com.workintech.FSWEBS18D2JavaProjesi.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CustomExceptionResponse> hCustomException(CustomException customException) {

        log.error("exception occurred msg -> " + customException.getMessage());
        var response = new CustomExceptionResponse(customException.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, customException.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<CustomExceptionResponse> hException(Exception exception) {

        log.error("exception occurred msg -> " + exception.getMessage());
        var response = new CustomExceptionResponse(exception.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


}
