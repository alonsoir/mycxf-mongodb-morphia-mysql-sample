package com.aironman.sample.dao;

import com.aironman.sample.dao.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User: aironman
 * Date: 4 de junio del 2014
 */
public interface UserDao extends CrudRepository<User,Long> {
}
