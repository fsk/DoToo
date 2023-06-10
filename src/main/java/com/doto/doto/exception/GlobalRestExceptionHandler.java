package com.doto.doto.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalRestExceptionHandler {

    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public ResponseEntity<RestError> notFoundException(final Exception exception, final HttpServletRequest request){
        var customRestError = RestError.builder()
                .message(exception.getCause().getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .build();
        return responseEntity(customRestError);
    }

    private static ResponseEntity<RestError> responseEntity(RestError customRestError){
        return ResponseEntity.status(HttpStatus.valueOf(customRestError.getStatus()))
                .body(customRestError);
    }


}
