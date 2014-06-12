package com.aironman.sample.mongo.repository;

import junit.framework.TestCase;

import org.bson.types.ObjectId;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aironman.sample.dao.EmployeeDao;
import com.aironman.sample.dao.model.Employee;
import com.mongodb.DBCollection;

/**
 * Date: 2010-09-09
 *
 * @author Konrad Malawski
 */
public class EmployeeDaoMorphiaImplTest extends TestCase {

    EmployeeDao employeeDao = new ClassPathXmlApplicationContext("/morphia-config.xml").getBean(EmployeeDao.class);

    public void testPersistAndRestore() throws Exception {
        Employee employee = new Employee();
        employee.setFirstName("Konrad");
        employee.setLastName("Malawski");
        employeeDao.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Alonso");
        employee1.setLastName("Isidoro");
        employeeDao.save(employee1);

        ObjectId id = employee.getId();
        assertNotNull(id);

        ObjectId id1 = employee1.getId();
        assertNotNull(id1);

        Employee reEmployee = employeeDao.get(id);
        assertEquals(employee.getFirstName(), reEmployee.getFirstName());
        assertEquals(employee.getLastName(), reEmployee.getLastName());
        
        Employee reEmployee1 = employeeDao.get(id1);
        assertEquals(employee1.getFirstName(), reEmployee1.getFirstName());
        assertEquals(employee1.getLastName(), reEmployee1.getLastName());
        
        DBCollection collection = employeeDao.getCollection();
        assertNotNull(collection);
        assertTrue(collection.count()>0);
        System.out.println("there are " + collection.count() + " documents in the collection...");
        System.out.println("the fullname of the collection is " + collection.getFullName());
        System.out.println("the name of the collection is " + collection.getName());
        System.out.println("the bit vector of query options is " + collection.getOptions());
        System.out.println("Returning a single object from this collection: " + collection.findOne());
    }
}
