package com.example.RestApiwithDatabase.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.RestApiwithDatabase.Exception.EmployeeNotFoundException;
import com.example.RestApiwithDatabase.Repositry.employeeRepositry;
import com.example.RestApiwithDatabase.entity.employee;
import com.example.RestApiwithDatabase.service.EmployeeService;
@Service
public class EmployeeServiceimpl implements EmployeeService{

	@Autowired
	employeeRepositry empRepository;
	@Override
	public String SaveEmployee( employee emp) 
	{
		empRepository.save(emp);
		return "Employeee Register Succifully";
		
	}
	
	public employee employeeGetByID(Integer id) {
		Optional<employee> byId = empRepository.findById(id);
		if(byId.isPresent())
		{
		    return byId.get();
		}
		throw new EmployeeNotFoundException("Employee Not Found With ID :"+id);
	}

	@Override
	public List<employee> getAllEmployees() 
	{
		return empRepository.findAll();
		
	}

}
