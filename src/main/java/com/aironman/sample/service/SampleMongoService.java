package com.aironman.sample.service;

import com.aironman.sample.exception.InvalidUserException;
import com.aironman.sample.mongo.documents.UserAccount;

public interface SampleMongoService {
	
	public UserAccount saveUser(UserAccount user) throws InvalidUserException;

}
