package com.exception;

public class StackUnderFlowException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public StackUnderFlowException(String msg) {
		super(msg);
	}
}
