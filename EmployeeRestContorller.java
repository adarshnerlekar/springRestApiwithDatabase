package com.example.RestApiwithDatabase.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApiwithDatabase.entity.employee;
import com.example.RestApiwithDatabase.service.EmployeeService;
@RestController
public class EmployeeRestContorller 
{
	@Autowired
	EmployeeService service;
	
	@GetMapping("All")
	public ResponseEntity<List<employee>> getall()
	{
		List<employee> allEmployees = service.getAllEmployees();
	   return new ResponseEntity<List<employee>>( allEmployees, HttpStatus.OK);
	}

	@GetMapping("byid")
	public ResponseEntity<employee> getbyId2(@RequestParam Integer id)
	{
		employee employee = service.employeeGetByID(id);
		
	    return new ResponseEntity<employee>( employee, HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("byid/{id}")
	public ResponseEntity<employee> getbyId(@PathVariable Integer id)
	{
		employee employee = service.employeeGetByID(id);
		
	    return new ResponseEntity<employee>( employee, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("database")
	public ResponseEntity<String> saveEmployee(@RequestBody employee employee)
	{
		String msg=service.SaveEmployee(employee);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
}
