package com.ldtech.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ldtech.entity.Employee;
import com.ldtech.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController{
   @Autowired
	private EmployeeService service;
	
  @PostMapping("/insertemp")
   public String insertEmp(@RequestBody Employee emp) {
	service.employeeInsert(emp);
	return "Record Inserted";
	   
   }
  @PostMapping("/insertall")
  public String allEmpInsert(@RequestBody List<Employee> emplist) {
	 service.allEmployeeInsert(emplist);
	return "All records Inserted";
	  
  }
  @GetMapping("/getallemp")
  public List<Employee> findAllEmps(){
	  List<Employee> limp=service.getAllEmployee();
	return limp;
	  
  }
  @GetMapping("/getemp/{empid}")
  public Optional<Employee> findEmpbyIds(@PathVariable("empid") Integer id){
	  Optional<Employee> limp=service.getEmployeeById(id);
	return limp;
	  
  }
  @DeleteMapping("/deleteemp")
  public String deleteEmpById(@RequestBody Integer id) {
	  service.deleteEmployee(id);
	return "Record deleted";
	  
  }
}
