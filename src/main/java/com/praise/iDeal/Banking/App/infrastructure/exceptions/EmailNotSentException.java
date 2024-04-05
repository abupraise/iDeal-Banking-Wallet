package com.praise.iDeal.Banking.App.infrastructure.exceptions;

public class EmailNotSentException extends RuntimeException{
    public EmailNotSentException(String message) {
        super(message);
    }
}
