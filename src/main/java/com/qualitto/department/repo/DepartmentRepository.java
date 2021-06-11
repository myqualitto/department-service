package com.qualitto.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qualitto.department.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
