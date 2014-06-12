package com.aironman.sample.service;

import org.mongodb.morphia.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aironman.sample.dao.EmployeeDao;
import com.aironman.sample.dao.model.Employee;
import com.aironman.sample.exception.InvalidUserException;

/**
 * the service to be used with morphia mongodb wrapper dao
 * User: aironman
 * Date: 4 de junio del 2014
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;


	public Key<Employee> saveEmployee(Employee employee) throws InvalidUserException {
		return employeeDao.save(employee);
	}
}
