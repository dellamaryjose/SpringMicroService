package com.addressservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressservice.model.Address;
import com.addressservice.repo.AddressRepo;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;
	
	
	public Address getAddress(int id) {
		
		
		return addressRepo.findById(id).get();
		
	}
	
	
	public String createAddress(Address address) {
		
		addressRepo.save(address);
		
		return "success";
		
	}

}
