//package com.react.demo.controller;
//
//
//import com.react.demo.exception.ExceptionResponse;
//import com.react.demo.exception.ResourceNotFoundException;
//import com.react.demo.util.ValidationUtil;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
///**
// * Created by DAM on 3/9/17.
// */
//@ControllerAdvice
//public class ExceptionHandlingController {
//
////    @ExceptionHandler(ResourceNotFoundException.class)
////    public ResponseEntity<ExceptionResponse> resourceNotFound(ResourceNotFoundException ex) {
////        ExceptionResponse response = new ExceptionResponse();
////        response.setErrorCode("Not Found");
////        response.setErrorMessage(ex.getMessage());
////
////        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.NOT_FOUND);
////    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<ExceptionResponse> invalidInput(MethodArgumentNotValidException ex) {
//        ExceptionResponse response = new ExceptionResponse();
//        response.setErrorCode("Validation Error");
//        response.setErrorMessage(ex.getMessage());
//        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.BAD_REQUEST);
//    }
//}