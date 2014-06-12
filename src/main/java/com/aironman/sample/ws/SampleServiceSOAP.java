package com.aironman.sample.ws;

import com.aironman.sample.dto.SignupForm;
import com.aironman.sample.exception.InvalidUserException;

import javax.jws.WebParam;
import javax.jws.WebService;

// SOAP Setup
@WebService
public interface SampleServiceSOAP {

    public SignupForm saveFrom(@WebParam(name="signupForm") SignupForm signupForm) throws InvalidUserException;
}