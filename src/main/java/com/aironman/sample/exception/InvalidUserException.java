package com.aironman.sample.exception;


/**
 * User: aironman
 * Date: 4 de junio del 2014
 */
public class InvalidUserException extends RuntimeException {

    public InvalidUserException(String s) {
        super(s);
    }
}
