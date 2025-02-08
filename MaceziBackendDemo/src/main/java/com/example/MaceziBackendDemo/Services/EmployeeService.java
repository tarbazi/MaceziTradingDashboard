package com.example.MaceziBackendDemo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MaceziBackendDemo.API.Model.Employee;
import com.example.MaceziBackendDemo.API.Model.Response;
import com.example.MaceziBackendDemo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    //ArrayList<Employee> employees;

    @Autowired
    EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployees(){
        return employeeRepository.findAll(); //Select * From Repo
    }

    public Response addEmployee(String name, String surname, String position, String phoneNumber, String salary){
        try{
            employeeRepository.save(new Employee(name, surname, position, phoneNumber, salary));
            return new Response("ACK");
        }

        catch (Exception e){
            return new Response("NAK");
        }
    }
}
