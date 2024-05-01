package com.pestanafj.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pestanafj.userdpt.entities.Department;
public interface DepartmentRepository extends JpaRepository<Department, Long> { }
