package com.aironman.sample.service;

import com.aironman.sample.exception.InvalidUserException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * User: aironman
 * Date: 4 de junio del 2014
 */
public class ExceptionHandler implements ExceptionMapper<InvalidUserException> {
    public Response toResponse(InvalidUserException exception) {
        Response.Status status;

        status = Response.Status.INTERNAL_SERVER_ERROR;

        return Response.status(status).header("exception", exception.getMessage()).build();
    }
}