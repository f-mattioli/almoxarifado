package br.edu.facthus.utils;

import javax.ejb.ApplicationException;

@ApplicationException
public class CustomRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public CustomRuntimeException(String message) {
		super(message);
	}
    
}
