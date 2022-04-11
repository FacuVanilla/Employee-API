package com.seun.online.controller;

import com.seun.online.entity.Employee;
import com.seun.online.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payroll")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getUsers(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    public Employee getUser(@PathVariable int id){
        return employeeRepository.getById(id);
    }

    @DeleteMapping("/employee/{id}")
    public Boolean deleteUser(@PathVariable int id){
        employeeRepository.deleteById(id);
        return true;
    }

    @PostMapping("/employee")
    public Employee createUser(Employee user){
        return employeeRepository.save(user);
    }

    @PutMapping("/employee")
    public Employee updateUser(Employee user){
        return employeeRepository.save(user);
    }

}
