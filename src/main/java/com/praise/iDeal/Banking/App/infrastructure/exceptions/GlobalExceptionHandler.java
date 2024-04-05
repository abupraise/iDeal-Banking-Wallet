package com.praise.iDeal.Banking.App.infrastructure.exceptions;

import com.praise.iDeal.Banking.App.domain.entities.ErrorDetails;
import com.praise.iDeal.Banking.App.payload.response.BankResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(EmailNotSentException.class)
    public ResponseEntity<BankResponse<ErrorDetails>> handleEmailNotSentException(final EmailNotSentException ex){
        ErrorDetails errorDetails = ErrorDetails.builder()
                .message(ex.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .debugMessage("Email Not Sent")
                .build();
        BankResponse<ErrorDetails> response = new BankResponse<>(ex.getMessage(), errorDetails);

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
