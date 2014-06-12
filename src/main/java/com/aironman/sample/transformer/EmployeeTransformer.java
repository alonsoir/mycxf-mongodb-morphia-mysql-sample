package com.aironman.sample.transformer;

import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import com.aironman.sample.dao.model.Employee;
import com.aironman.sample.dto.EmployeeForm;


/**
 * User: aironman
 * Date: 4 de junio del 2014
 */
@Component
public class EmployeeTransformer {

    private DozerBeanMapper mapper = new DozerBeanMapper();

    public Employee signupFormToEmployee(EmployeeForm employeeform) {
    	Employee employee = mapper.map(employeeform, Employee.class);
        return employee;
    }

    public EmployeeForm employeeToSignupForm(Employee employee) {
    	EmployeeForm employeeform = mapper.map(employee, EmployeeForm.class);
        return employeeform;
    }

}
