package org.johnsoncodelove.service;

import org.johnsoncodelove.model.Employee;

import java.util.ArrayList;

public class EmployeeManagementSystem {

    private ArrayList<Employee> employees =new ArrayList<>();

    // Create Employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    // Read Employees
    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Find Employee by ID
    public Employee findEmployeeById(int id) {

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }

        return null;
    }

    // Update Employee
    public void updateEmployee(int id, String newName, double newSalary) {

        Employee employee = findEmployeeById(id);

        if (employee != null) {
            employee.setName(newName);
            employee.setSalary(newSalary);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        Employee employee = findEmployeeById(id);

        if (employee != null) {
            employees.remove(employee);
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
