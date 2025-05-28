package com.example.demo.service;


import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;

import com.example.demo.model.Department;
import com.example.demo.model.respository.DepartmentRepo;

import jakarta.persistence.EntityNotFoundException;


@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo repo;

    public List<Department> getDepts() {
        return repo.findAll();
    }

    public Department getDept(int id) {
        if (repo.findById(id).isEmpty()) {
            throw new EntityNotFoundException("Department Not Found");
        }
        return repo.findById(id).get();
    }


    public String addDept(Department department) {
        if (repo.findById(department.getId()).isPresent()) {
            throw new DuplicateKeyException("The department id is already availabale");

        }
        repo.save(department);
        return "New Department added";

    }


}
