package com.qualitto.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qualitto.department.entities.Department;
import com.qualitto.department.repo.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repo;

	public Department saveDepartment(Department department) {
		return repo.save(department);
	}

	public Optional<Department> findById(Long id) {
		return repo.findById(id);
	}

}