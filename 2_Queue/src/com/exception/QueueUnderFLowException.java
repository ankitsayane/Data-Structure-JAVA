package com.exception;

public class QueueUnderFLowException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public QueueUnderFLowException(String msg) {
		super(msg);
	}

}
