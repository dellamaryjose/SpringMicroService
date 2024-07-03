package com.employeeservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employeeservice.model.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Integer>{

}
