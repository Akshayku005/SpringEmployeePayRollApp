package com.bridgelabz.employeepayrollapp.dto;

import java.time.LocalDate;

public class EmployeePayrollDTO {

    private int employeeId;
    public String name;
    public long salary;

    public EmployeePayrollDTO(int employeeId, String name, long salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}

