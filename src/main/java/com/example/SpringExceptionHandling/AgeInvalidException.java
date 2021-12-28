package com.example.SpringExceptionHandling;

public class AgeInvalidException extends  RuntimeException {
public AgeInvalidException(String msg) {
	super(msg);
}
}
