package com.example.demo.models;

import com.sun.javafx.beans.IDProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")/// this annotation is used to map a java class into a collection inside mongoDB
public class Employee {
    @Id
    private int empID;
    private String name;
    private String email;
    private String address;

    ///////// constructor
    public Employee(int empID,String name,String email,String address){
        this.empID=empID;
        this.email=email;
        this.name=name;
        this.address=address;
    }
    /////// Getters
    public int getEmpID(){
        return empID;
    }
    public String getEmail(){
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    //////Setters.....
    public void setEmpID(int a){
        empID=a;
    }
    public void setName(String n){
        name=n;
    }
    public void setEmail(String e){
        email=e;
    }
    public void setAddress(String add){
        address=add;
    }

}
