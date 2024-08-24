package com.example.EmployeeManagement.service;

import com.example.EmployeeManagement.DTO.AddressDTO;
import com.example.EmployeeManagement.DTO.EmployeeDTO;
import com.example.EmployeeManagement.model.*;
import com.example.EmployeeManagement.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements EmployeeServiceInterface{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Transactional
    public Employee addEmployee(Employee employee) {
        departmentRepository.save(employee.getDepartment());
        roleRepository.save(employee.getRole());
        projectRepository.saveAll(employee.getProjects());
        addressRepository.saveAll(employee.getAddresses());
        return  employeeRepository.save(employee);
    }
}
