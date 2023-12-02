package com.example.demo.Service;

import java.util.List;

import com.example.demo.Module.Employee;

public interface EmployeeService 
{
	Employee addEmployee(Employee e);
	
	Employee getById(Integer eid);
	
	List<Employee>getByDesignation(String designation);
	
	List<Employee>getByLessSal(Double sal);

	Employee updateEmp(Employee e);
}
