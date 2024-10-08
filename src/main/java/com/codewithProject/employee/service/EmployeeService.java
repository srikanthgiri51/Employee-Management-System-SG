package com.codewithProject.employee.service;

import com.codewithProject.employee.entity.Employee;
import com.codewithProject.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee postEmployee(Employee employee){
        return  employeeRepository.save(employee);
    }
}