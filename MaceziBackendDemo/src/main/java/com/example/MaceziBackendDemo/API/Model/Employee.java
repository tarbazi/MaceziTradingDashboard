package com.example.MaceziBackendDemo.API.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//import java.util.ArrayList;

@Entity
@Table
public class Employee {
    @Id
    @SequenceGenerator( name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "employee_sequence")

    private long id;
    private String Name;
    private String Surname;
    private String Position;
    private String PhoneNumber;
    private String Salary;
    //private ArrayList<Order> Orders;

    public Employee(){
        
    }

    public Employee(String Name, String Surname, String Position, String PhoneNumber, String Salary){
        this.Name = Name;
        this.Surname = Surname;
        this.Position = Position;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        //this.Orders = new ArrayList<>();
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setSurname(String Surname){
        this.Surname = Surname;
    }

    public String getSurname(){
        return Surname;
    }
}
