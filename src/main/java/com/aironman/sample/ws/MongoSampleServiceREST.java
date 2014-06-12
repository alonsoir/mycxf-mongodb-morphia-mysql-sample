package com.aironman.sample.ws;

import com.aironman.sample.dto.SignupForm;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// REST Setup (Follows JAX-RS)
@Path("/mongoSampleService")
@Produces("application/json")
public interface MongoSampleServiceREST {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/saveMongoForm")
    public SignupForm saveFrom(SignupForm signupForm);

}
