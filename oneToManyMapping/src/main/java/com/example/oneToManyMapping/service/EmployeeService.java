package com.example.oneToManyMapping.service;

import com.example.oneToManyMapping.dto.ResponseDto;
import com.example.oneToManyMapping.entity.Employee;
import com.example.oneToManyMapping.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repo;
    public Employee saveEmployee(Employee employee){
        return repo.save(employee);

    }
    public Optional<Employee> getEmployeeById(int id){

        return repo.findById(id);
    }
    public List<Employee> fetechAll(){
        return repo.findAll();
    }
    public List<ResponseDto> joinInfo(){
        return repo.joinInfo();
    }
    public Employee findByEmpName(String empName){
        return repo.findByEmpName(empName);
    }
}
