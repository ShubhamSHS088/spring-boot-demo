package com.maersk.demo.service;

import com.maersk.demo.model.Employee;
import com.maersk.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo repo;

    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(int employeeId) {
        return repo.findById(employeeId).orElse(new Employee());
    }

    public void addNewEmployee(Employee employee) {
        repo.save(employee);
    }

    public void updateEmployee(Employee employee) {
        repo.save(employee);
    }

    public void deleteEmployee(int employeeId) {
        repo.deleteById(employeeId);
    }
}
