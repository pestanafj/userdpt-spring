package com.pestanafj.userdpt.controllers;

import java.util.List;

import com.pestanafj.userdpt.entities.Department;
import com.pestanafj.userdpt.repositories.DepartmentRepository;
import com.pestanafj.userdpt.repositories.UserRepository;
import com.pestanafj.userdpt.entities.User;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value="/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @GetMapping
    public List<Department> findAll(){
        return repository.findAll();
    }

    @GetMapping(value ="/{id}")
    public Department findAll(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping
    public Department insert(@RequestBody Department department){
        return repository.save(department);
    }




}
