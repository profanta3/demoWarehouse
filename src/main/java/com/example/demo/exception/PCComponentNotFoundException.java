package com.example.demo.exception;

public class PCComponentNotFoundException extends RuntimeException{
    public PCComponentNotFoundException(Long id) {
        super("Could not find PcComponent "+id);
    }
}
