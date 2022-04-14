package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ComponentNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(PCComponentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String componentNotFoundHandler(PCComponentNotFoundException exception) {
        return exception.getMessage();
    }
}
