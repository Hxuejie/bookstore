package com.hxj.web.bookstore.base;

public class DaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DaoException(String message) {
		super(message);
	}

}
