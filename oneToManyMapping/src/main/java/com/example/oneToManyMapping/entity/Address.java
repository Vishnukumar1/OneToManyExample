package com.example.oneToManyMapping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Address_Table")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int houseNo;
    private String street;
    private String state;
    private double pincode;
}

