package com.example.oneToManyMapping.controller;


import com.example.oneToManyMapping.dto.ResponseDto;
import com.example.oneToManyMapping.entity.Employee;
import com.example.oneToManyMapping.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/oneToMany")
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return  service.saveEmployee(employee);
    }
    @GetMapping("/findByName/{name}")
    public Optional<Employee> findByName(@PathVariable int empId){
        return service.getEmployeeById(empId);
    }
    @GetMapping("/fetechAll")
    public List<Employee> fetechAll(){
        return service.fetechAll();
    }
    @GetMapping("/fetechDetails")
    public List<ResponseDto> joinInfo(){
        return service.joinInfo();
    }
    @GetMapping("/{name}")
    public Employee EmployeegetByName(@PathVariable String empName){
        return service.findByEmpName(empName);
    }
}
