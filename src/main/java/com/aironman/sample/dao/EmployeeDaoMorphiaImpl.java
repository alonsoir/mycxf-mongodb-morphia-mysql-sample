package com.aironman.sample.dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.springframework.stereotype.Repository;

import com.aironman.sample.dao.model.Employee;
import com.mongodb.Mongo;


/**
 * Date: 12 junio 2014
 *
 * @author Konrad Malawski
 * @author Alonso Isidoro
 * I can not use @Repository, why?
 */
//@Repository
public class EmployeeDaoMorphiaImpl extends BasicDAO<Employee, ObjectId> implements EmployeeDao {

	public EmployeeDaoMorphiaImpl(Morphia morphia,Mongo mongo,String dbName) {
		super(mongo, morphia,dbName);
	}
}
