package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee extends Person {
    @Id
    private String empNo;
    private double salary;
    @ManyToOne
    private Department department;
    @ManyToMany(mappedBy = "employees")
    private List<Project>projects;
}

