package com.addressservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.addressservice.model.Address;

@Repository
public interface AddressRepo extends MongoRepository<Address, Integer> {

}
