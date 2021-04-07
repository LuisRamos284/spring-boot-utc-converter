package com.example.demo.controllers;

import com.example.demo.models.ErrorResponse;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.text.ParseException;

@ControllerAdvice
public class ErrorHandlerController {

    Gson gson = new Gson();

    @ExceptionHandler({ParseException.class, NullPointerException.class, IllegalArgumentException.class})
    public ResponseEntity<String> handle(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(gson.toJson(new ErrorResponse(e.getMessage())));
    }

}
