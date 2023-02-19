package com.demo.service;

import java.util.List;

import com.demo.entity.Department;
import com.demo.error.DepartmentNotFoundException;

public interface DepartmentService {
	public Department saveDepartment(Department department);
	
	public List<Department> fetchDepartmentDetails();
	
	public Department fetchByDepartmentId(Long departmentId) throws DepartmentNotFoundException;
	
	public void deleteDepById(Long departmentID);
	
	public Department updateDep(Long departmentId, Department department);
	
	public Department fetchByDepartmentName(String departmentName);
	
	

}
