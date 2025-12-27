package com.example.RestApiwithDatabase.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestApiwithDatabase.entity.employee;

public interface employeeRepositry extends JpaRepository<employee, Integer>{

}
