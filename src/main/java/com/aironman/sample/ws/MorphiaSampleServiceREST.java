package com.aironman.sample.ws;

import com.aironman.sample.dto.EmployeeForm;
import com.aironman.sample.dto.SignupForm;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// REST Setup (Follows JAX-RS)
@Path("/employee")
@Produces("application/json")
public interface MorphiaSampleServiceREST {

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/save")
    public SignupForm save(EmployeeForm employeeForm);

}
