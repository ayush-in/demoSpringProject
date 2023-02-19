package com.demo.Controller;

import com.demo.service.DepartmentService;
import com.demo.entity.Department;
import com.demo.error.DepartmentNotFoundException;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController implements DepartmentService{
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/departments")
	public Department saveDepartment(@Validated @RequestBody Department department) {
		LOGGER.info("Inside saveDepartment of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentDetails(){
		LOGGER.info("Inside fetchDepartmentList of DepartmentController");	
		return departmentService.fetchDepartmentDetails();
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchByDepartmentId(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
		return departmentService.fetchByDepartmentId(departmentId);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDeparmentById(@PathVariable("id") Long departmentId) {
		departmentService.deleteDepById(departmentId);
		return "Department " + departmentId + " successfully deleted";
	}
	
	
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
		return departmentService.updateDep(departmentId, department);
	}
	
	@GetMapping("/departments/name/{name}")
	public Department fetchByDepartmentName(@PathVariable("name") String departmentName){
		return departmentService.fetchByDepartmentName(departmentName);
	}

	@Override
	public void deleteDepById(Long departmentID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department updateDep(Long departmentId, Department department) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
