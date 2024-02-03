package com.example.oneToManyMapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Employee_Table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private String empName;
    private String email;
    private Double salary;
    private Long mobileNo;
    @OneToMany(targetEntity = Address.class,
            fetch = FetchType.EAGER,
             cascade = CascadeType.ALL,
              orphanRemoval = true)
    @JoinColumn(referencedColumnName = "empId",
                name="emp_Id")
    private List<Address> address;
}
