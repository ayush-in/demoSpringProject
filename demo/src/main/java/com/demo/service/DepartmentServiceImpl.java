package com.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Department;
import com.demo.repository.DepartmentRepo;
import com.demo.error.DepartmentNotFoundException;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}
	
	@Override
	public List<Department> fetchDepartmentDetails(){
		return departmentRepo.findAll();
	}
	
	@Override 
	public Department fetchByDepartmentId(Long departmentId) throws DepartmentNotFoundException {
		Optional<Department> department = departmentRepo.findById(departmentId);
		
		if(!department.isPresent()) {
			throw new DepartmentNotFoundException("Department Not Available");
		}
		
		return department.get();
	}
	
	@Override
	public void deleteDepById(Long departmentId) {
		departmentRepo.deleteById(departmentId);
	}
	
	@Override 
	public Department updateDep(Long departmentId, Department department) {
		Department dep = departmentRepo.findById(departmentId).get();
		
		if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			dep.setDepartmentName(department.getDepartmentName());
		}
		
		if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			dep.setDepartmentCode(department.getDepartmentCode());
		}
		
		if (Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			dep.setDepartmentAddress(department.getDepartmentAddress());
		}
		
		return departmentRepo.save(dep);
	}
	
	@Override
	public Department fetchByDepartmentName(String departmentName) {
		return departmentRepo.findByDepartmentName(departmentName);
	}
	

}
