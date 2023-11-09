package com.comrade.exception;

import com.comrade.model.error.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //HttpClientErrorException.BadRequest.class,
    //HttpMessageNotReadableException.class
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public ResponseEntity<CommonException> badRequestHandler(Exception exception){
        return new ResponseEntity<>(CommonException.builder().message(exception.getMessage()).build(), HttpStatus.BAD_REQUEST);
    }
}
