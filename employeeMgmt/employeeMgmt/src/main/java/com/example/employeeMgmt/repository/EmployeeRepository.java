package com.example.employeeMgmt.repository;

import com.example.employeeMgmt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}