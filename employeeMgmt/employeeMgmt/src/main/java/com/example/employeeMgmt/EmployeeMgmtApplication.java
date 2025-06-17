package com.example.employeeMgmt;

import com.example.employeeMgmt.model.Employee;
import com.example.employeeMgmt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.io.File;

@SpringBootApplication

public class EmployeeMgmtApplication  {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMgmtApplication.class, args);
	}


	
}