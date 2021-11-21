package com.example.cc1romainkamiri.exeptions;

public class NullUserException extends Exception{
    public NullUserException(){
        super("User must not be null");
    }
}
