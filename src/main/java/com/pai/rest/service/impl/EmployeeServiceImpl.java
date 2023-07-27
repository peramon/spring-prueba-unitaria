package com.pai.rest.service.impl;

import com.pai.rest.exception.ResourceNotFoundException;
import com.pai.rest.model.Employee;
import com.pai.rest.repository.EmployeeRepository;
import com.pai.rest.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        Optional<Employee> employeeSaved = employeeRepository.findByEmail(employee.getEmail());
        if(employeeSaved.isPresent()){
            throw new ResourceNotFoundException("The employee is already exist: " + employee.getEmail());
        }
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee employeeUpdate) {
        return employeeRepository.save(employeeUpdate);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
