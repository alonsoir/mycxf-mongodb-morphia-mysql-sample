package com.aironman.sample.service;

import org.mongodb.morphia.Key;

import com.aironman.sample.dao.model.Employee;
import com.aironman.sample.exception.InvalidUserException;

/**
 * the service to be used with a mysql db
 * User: aironman
 * Date: 4 de junio del 2014
 */
public interface EmployeeService {

    public Key<Employee> saveEmployee(Employee employee) throws InvalidUserException;

}
