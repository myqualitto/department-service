package com.qualitto.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qualitto.department.entities.Department;
import com.qualitto.department.repo.DepartmentRepository;

@Service
public class DepartmentService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment of DepartmentService");
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(Long departmentId){
		log.info("Inside findDepartmentById of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
