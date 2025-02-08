package com.example.MaceziBackendDemo.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MaceziBackendDemo.API.Model.Employee;
import com.example.MaceziBackendDemo.API.Model.Response;
import com.example.MaceziBackendDemo.Services.EmployeeService;

@RestController
public class EmployeeController {

    private EmployeeService service;

    @Autowired
    EmployeeController(EmployeeService service){
        this.service = service;
    }
    // https/8080/getEmployees/tarbazi/2265
    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }

    @GetMapping("/createEmployee")
    public Response createEmployee(@RequestParam String name, @RequestParam String surname, @RequestParam String position, @RequestParam String phoneNumber, @RequestParam String salary){
        return service.addEmployee(name, surname, position, phoneNumber, salary);
    }

}
