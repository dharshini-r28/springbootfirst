package com.example.firstspring.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.example.firstspring.dto.ErrorDetails;
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<?> handleArithmeticExceptions(Exception ex) {
        return new ResponseEntity<>(new ErrorDetails(ex.getMessage(),"Please try again later",500), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<?> handleAllExceptions(Exception ex) {
        return new ResponseEntity<>(new ErrorDetails(ex.getMessage(),"Something went wrong",500), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
