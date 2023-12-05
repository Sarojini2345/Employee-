package com.ldtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldtech.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee,Integer> {

}
