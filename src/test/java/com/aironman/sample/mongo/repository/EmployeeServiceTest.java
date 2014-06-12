package com.aironman.sample.mongo.repository;

import java.util.Date;

import junit.framework.TestCase;

import org.mongodb.morphia.Key;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aironman.sample.dao.model.Address;
import com.aironman.sample.dao.model.Employee;
import com.aironman.sample.service.EmployeeService;

public class EmployeeServiceTest extends TestCase  {
	
	private EmployeeService employeeService=new ClassPathXmlApplicationContext("/ApplicationTestContext.xml").getBean(EmployeeService.class);

	public void testCreateEmployee() throws Exception {
		Employee employee = new Employee();
		employee.setActive(Boolean.TRUE);
		Address address = new Address();
		address.setLatitud("LAT");
		address.setLongitud("LON");
		address.setStreet("STREET_NAME");
		employee.setAddress(address );
		Date endDate = null;//System.currentTimeMillis();
		employee.setEndDate(endDate );
		employee.setFirstName("firstname");
//		employee.setId(id);
		employee.setLastName("lastname");
		Employee manager = null;
		employee.setManager(manager );
		int notStored = 0;
		employee.setNotStored(notStored );
		Long salary = 43000l;
		employee.setSalary(salary );
		Date startDate = new Date(System.currentTimeMillis());
		employee.setStartDate(startDate );
		boolean stored = Boolean.TRUE;
		employee.setStored(stored );
//		employee.setUnderlings(underlings);
		Key<Employee> outKey = employeeService.saveEmployee(employee );
		assertNotNull(outKey);
		System.out.println(outKey.toString());
		System.out.println("name collection: " + outKey.getKind());
		System.out.println("id collection: " + outKey.getId());
		
	}

}
