package com.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.demo.entity.Department;
import com.demo.repository.DepartmentRepo;

@SpringBootTest
class DepartmentServiceTest {
	
	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepo departmentRepository;
	
	@BeforeEach
	void setUp() {
		Department department = 
				Department.builder().departmentName("IT").departmentCode("1001").departmentAddress("Address1").departmentId(1L).build();
		
		Mockito.when(departmentRepository.findByDepartmentName("IT")).thenReturn(department);
		
	}
	
	@Test
	@DisplayName("Department Name Validation")
	public void departmentNameValidation() {
		String departmentName = "IT";
		Department found = departmentService.fetchByDepartmentName(departmentName);
		
		assertEquals(departmentName, found.getDepartmentName());
	}
}
