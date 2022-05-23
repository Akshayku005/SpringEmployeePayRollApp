package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.model.Employee;

public interface IEmployeePayrollService {
    public String getMessage(String name) ;
    public String postMessage(Employee employee);
    public String putMessage(String name) ;
}
