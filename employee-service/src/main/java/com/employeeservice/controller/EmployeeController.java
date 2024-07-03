package com.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeservice.model.Employee;
import com.employeeservice.model.EmployeeResponse;
import com.employeeservice.service.EmployeeService;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService ;
	
	@GetMapping("/getEmp/{id}")
	public ResponseEntity<EmployeeResponse> getEmployee(@PathVariable int id) {
		
		EmployeeResponse emp = employeeService.getEmployee(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(emp);
		
	}
	
	@PostMapping("/create")
	public String createEmployee(@RequestBody Employee employee) {
		
		return employeeService.createEmployee(employee);
		
	}
}
