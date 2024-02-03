package com.example.oneToManyMapping.repository;


import com.example.oneToManyMapping.dto.ResponseDto;
import com.example.oneToManyMapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    @Query("select new com.example.oneToManyMapping.dto.ResponseDto(e.empName,e.email,a.state )from Employee e JOIN e.address a")
    List<ResponseDto> joinInfo();
    //@Query("select employee where e.name=?1")
    Employee findByEmpName(String empName);
}
