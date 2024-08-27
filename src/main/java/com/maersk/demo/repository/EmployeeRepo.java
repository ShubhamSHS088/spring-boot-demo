package com.maersk.demo.repository;

import com.maersk.demo.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
