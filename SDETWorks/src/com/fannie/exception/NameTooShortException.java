package com.fannie.exception;

// by extending the class with Exception class, you make 
// this as checked Exception, if its checked exception 
// then you have to surround with try catch block or
// throw that to calling party 

public class NameTooShortException extends Exception{
	
	private String message; 
	
	
	public NameTooShortException() {
		this.message = "Sorry Name Too Small"; 
	} 
	
	public NameTooShortException(String message) {
		this.message  = message; 
	}

	@Override
	public String toString() {
		return "NameTooShortException [message=" + message + "]";
	}
	
	
}
