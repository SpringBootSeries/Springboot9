package com.example.demo.exceptionHandler;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.persistence.EntityNotFoundException;
import lk.ac.vau.fas.ict.model.ErrorResponce;

@RestControllerAdvice
public class GenericExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponce> handleEntityNotFound(EntityNotFoundException exception) {
        ErrorResponce errorResponce = new ErrorResponce(HttpStatus.NOT_FOUND.value(),
                exception.getMessage());
        return new ResponseEntity<ErrorResponce>(errorResponce, HttpStatus.NOT_FOUND);
    }

}

