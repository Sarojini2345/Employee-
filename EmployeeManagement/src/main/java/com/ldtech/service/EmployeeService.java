package com.ldtech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldtech.entity.Employee;
import com.ldtech.repository.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
	private IEmployeeRepo emprepo;

	@Override
	public void employeeInsert(Employee employee) {
		// TODO Auto-generated method stub
        emprepo.save(employee);
	}

	@Override
	public void allEmployeeInsert(List<Employee> empList) {
		// TODO Auto-generated method stub
        emprepo.saveAll(empList);
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> listemp=emprepo.findAll();
		return listemp;
		// TODO Auto-generated method stub
	   
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp=emprepo.findById(id);
		return emp;
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		emprepo.deleteById(id);

	}

}
