package com.example.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.fas.ict.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}

