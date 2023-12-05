package com.ldtech.service;

import java.util.List;
import java.util.Optional;

import com.ldtech.entity.Employee;

public interface IEmployeeService {
	
	
	 void employeeInsert(Employee employee);
	 
	 void allEmployeeInsert(List<Employee> empList);
	 
	 List<Employee> getAllEmployee();
	 
	 Optional<Employee> getEmployeeById(Integer id);
	 
	 void deleteEmployee(Integer id);
	 
}
