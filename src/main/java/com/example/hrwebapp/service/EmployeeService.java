package com.example.hrwebapp.service;

import com.example.hrwebapp.model.Employee;
import com.example.hrwebapp.repository.EmployeeProxy;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final EmployeeProxy employeeProxy;

    public EmployeeService(EmployeeProxy employeeProxy) {
        this.employeeProxy = employeeProxy;
    }

    public Employee getEmployee(final int id) {
        return employeeProxy.getEmployee(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeProxy.getEmployees();
    }

    public void deleteEmployee(final int id) {
        employeeProxy.deleteEmployee(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee;

        // Functional rule : Last name must be capitalized.
        employee.setLastName(employee.getLastName().toUpperCase());

        if(employee.getId() == null) {
            // If id is null, then it is a new employee.
            savedEmployee = employeeProxy.createEmployee(employee);
        } else {
            savedEmployee = employeeProxy.updateEmployee(employee);
        }

        return savedEmployee;
    }
}
