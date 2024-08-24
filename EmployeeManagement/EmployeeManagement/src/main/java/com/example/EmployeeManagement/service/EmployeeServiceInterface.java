package com.example.EmployeeManagement.service;

import com.example.EmployeeManagement.DTO.EmployeeDTO;
import com.example.EmployeeManagement.model.Employee;
import com.example.EmployeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface EmployeeServiceInterface {



    public Employee addEmployee(Employee employee);
}
