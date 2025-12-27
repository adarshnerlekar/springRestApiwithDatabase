package com.example.RestApiwithDatabase.service;

import java.util.List;

import com.example.RestApiwithDatabase.entity.employee;

public interface EmployeeService {
	
       String SaveEmployee(employee emp);
       employee employeeGetByID(Integer id);
       List<employee> getAllEmployees();

}
