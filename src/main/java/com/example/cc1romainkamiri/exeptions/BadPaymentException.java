package com.example.cc1romainkamiri.exeptions;

public class BadPaymentException extends Exception{
    public BadPaymentException(){
        super("Something went wrong with the payment ...");
    }
}
