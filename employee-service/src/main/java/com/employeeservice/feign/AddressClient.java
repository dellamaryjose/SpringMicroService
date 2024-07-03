package com.employeeservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employeeservice.model.AddressResponse;

@FeignClient(url="http://localhost:8081" , value ="address-service" , path = "/api/address")
public interface AddressClient {

	@GetMapping("/getAddress/{id}")
	public ResponseEntity<AddressResponse> getAddress(@PathVariable int id);
}
