package com.buszek.repository;

import com.buszek.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByLastName(String lastname);
    
}
