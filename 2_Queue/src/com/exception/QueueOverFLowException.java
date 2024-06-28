package com.exception;

public class QueueOverFLowException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public QueueOverFLowException(String msg) {
		super(msg);
	}

}
