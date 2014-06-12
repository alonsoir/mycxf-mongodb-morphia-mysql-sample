package com.aironman.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aironman.sample.exception.InvalidUserException;
import com.aironman.sample.mongo.documents.UserAccount;
import com.aironman.sample.mongo.repository.UserAccountRepository;

@Service("mongosampleService")
public class SampleMongoServiceImpl implements SampleMongoService {

	@Autowired
	private UserAccountRepository userAccount;
	
	public UserAccount saveUser(UserAccount user) throws InvalidUserException {
		
		return userAccount.save(user);
	}

}
