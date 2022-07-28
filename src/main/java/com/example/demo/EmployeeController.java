package com.example.demo;

import com.example.demo.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeRepository employeeRepository;


    @GetMapping(value="all")
    public List<Employee>getAllEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping(value="/create")
    public String createEmployee(@RequestBody Employee employee){

        Employee insertedEmployee=employeeRepository.insert(employee);
        return "Employee created..";
    }

//    @GetMapping(value="all/{id}")
//    public Optional<Employee>getEmployee(@PathVariable int id){
//        return employeeRepository.findById(id);
//    }

    @PutMapping(value="/update")
    public String updateEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Updated successfully";
    }

}
