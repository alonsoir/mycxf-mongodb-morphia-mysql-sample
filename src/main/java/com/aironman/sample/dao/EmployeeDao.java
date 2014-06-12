package com.aironman.sample.dao;

import org.bson.types.ObjectId;

import com.aironman.sample.dao.model.Employee;

/**
 * Date: 12 junio 2014
 *
 * @author Konrad Malawski
 * @author Alonso Isidoro
 */
public interface EmployeeDao extends org.mongodb.morphia.dao.DAO<Employee, ObjectId>  {
}
