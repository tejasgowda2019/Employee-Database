package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Module.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeContoller {
	
	@Autowired
	EmployeeService ser;
	
	@PostMapping("/addEmployee") 
	ResponseEntity<Employee>addEmployee(@RequestBody Employee e)
	{
		return new ResponseEntity<Employee>(ser.addEmployee(e),HttpStatus.CREATED);
	}
	
	@GetMapping("/empById")
	ResponseEntity<Employee>getById(@RequestHeader Integer eid)
	{
		return new ResponseEntity<Employee>(ser.getById(eid),HttpStatus.FOUND);
	}
	
	@GetMapping("/empByDesignation")
	ResponseEntity<List<Employee>>getByDesignation(@RequestHeader String designation)
	{
		return new ResponseEntity<List<Employee>>(ser.getByDesignation(designation),HttpStatus.FOUND);
	}
	
	@GetMapping("/empByLessSal")
	ResponseEntity<List<Employee>>getByLessSal(@RequestHeader Double sal)
	{
		return new ResponseEntity<List<Employee>>(ser.getByLessSal(sal),HttpStatus.FOUND);
	}
	
	@PutMapping("/updateEmp")
	ResponseEntity<Employee> updateEmp(@RequestBody Employee e)
	{
		return new ResponseEntity<Employee>(ser.updateEmp(e),HttpStatus.OK);
	}
	
	
//	@RequestMapping("/dummy")
//	String Dummy()
//	{
//		return "<h1>Dummy Application<h1>";
//	}
//	@RequestMapping("/demo")
//	String demo()
//	{
//		return "<h1>Demo application<h1>";
//	}
}
