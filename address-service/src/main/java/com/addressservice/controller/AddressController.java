package com.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.addressservice.model.Address;
import com.addressservice.service.AddressService;


@RestController
@RequestMapping("/api/address")
public class AddressController {

	
	@Autowired
	AddressService addressService ;
	
	@GetMapping("/getAddress/{id}")
	public ResponseEntity<Address> getAddress(@PathVariable int id) {
		
		Address address = addressService.getAddress(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(address);
		
	}
	
	@PostMapping("/create")
	public String createAddress(@RequestBody Address address) {
		
		return addressService.createAddress(address);
		
	}
}
