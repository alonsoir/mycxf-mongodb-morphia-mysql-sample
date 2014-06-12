package com.aironman.sample.service;

import com.aironman.sample.dao.model.User;
import com.aironman.sample.exception.InvalidUserException;

/**
 * the service to be used with a mysql db
 * User: aironman
 * Date: 4 de junio del 2014
 */
public interface SampleService {

    public User saveUser(User user) throws InvalidUserException;

}
