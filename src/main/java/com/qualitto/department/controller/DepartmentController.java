package com.qualitto.department.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qualitto.department.entities.Department;
import com.qualitto.department.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService deptSrv;

	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return deptSrv.saveDepartment(department);
	}

	@GetMapping("/{id}")
	public Department findById(@PathVariable(value = "id") Long departmentId) {
		Optional<Department> deptData = deptSrv.findById(departmentId);
		if (deptData.isPresent()) {
			return deptData.get();
		} else {
			return null;
		}
	}
}
