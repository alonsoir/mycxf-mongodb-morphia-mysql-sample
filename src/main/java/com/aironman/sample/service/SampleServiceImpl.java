package com.aironman.sample.service;

import com.aironman.sample.dao.UserDao;
import com.aironman.sample.dao.model.User;
import com.aironman.sample.exception.InvalidUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * the service to be used with mysql db
 * User: aironman
 * Date: 4 de junio del 2014
 */
@Service("sampleService")
public class SampleServiceImpl implements SampleService {

    @Autowired
    UserDao userDao;

    public User saveUser(User user) throws InvalidUserException{

        String firstName = user.getFirstName();

        if(!StringUtils.isEmpty(firstName) && "Dave".equalsIgnoreCase(firstName)) {
            throw new InvalidUserException("Sorry Dave");
        }

        return userDao.save(user);

    }
}
