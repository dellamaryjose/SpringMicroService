package com.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employeeservice.feign.AddressClient;
import com.employeeservice.model.AddressResponse;
import com.employeeservice.model.Employee;
import com.employeeservice.repository.EmployeeRepo;
import com.employeeservice.model.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private AddressClient addressClient;
	
	public EmployeeResponse getEmployee(int id) {
		
		
		Employee emp = employeeRepo.findById(id).get();
		
		EmployeeResponse empResp = new EmployeeResponse();
		ResponseEntity<AddressResponse> address = addressClient.getAddress(id);
		empResp.setAddressResponse(address.getBody());
		empResp.setEmp(emp);
		return empResp;
		
	}
	
	
	public String createEmployee(Employee emp) {
		
		employeeRepo.save(emp);
		
		return "Success";
		
	}

}
