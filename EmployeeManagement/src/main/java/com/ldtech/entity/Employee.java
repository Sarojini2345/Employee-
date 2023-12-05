package com.ldtech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int empId;
   private String empName;
   private String empDesig;
public long getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDesig() {
	return empDesig;
}
public void setEmpDesig(String empDesig) {
	this.empDesig = empDesig;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empDesig=" + empDesig + "]";
}
   
}
