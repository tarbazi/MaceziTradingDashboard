package com.example.MaceziBackendDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MaceziBackendDemo.API.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
