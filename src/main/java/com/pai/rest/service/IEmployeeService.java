package com.pai.rest.service;

import com.pai.rest.model.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(long id);
    Employee updateEmployee(Employee employeeUpdate);
    void deleteEmployee(long id);
}
