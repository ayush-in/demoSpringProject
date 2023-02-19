package com.demo.entity;

import lombok.*;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

@Builder
@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	
	
    @NotBlank(message = "Department Name cannot be blank")
    private String departmentName;
	
	private String departmentAddress;
	
	private String departmentCode;
	
	
	
	
	
	
	
	
	
	
//	public Department() {}
//
//	public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
//		super();
//		this.departmentId = departmentId;
//		this.departmentName = departmentName;
//		this.departmentAddress = departmentAddress;
//		this.departmentCode = departmentCode;
//	}
//
//	public Long getDepartmentId() {
//		return departmentId;
//	}
//
//	public void setDepartmentId(Long departmentId) {
//		this.departmentId = departmentId;
//	}
//
//	public String getDepartmentName() {
//		return departmentName;
//	}
//
//	public void setDepartmentName(String departmentName) {
//		this.departmentName = departmentName;
//	}
//
//	public String getDepartmentAddress() {
//		return departmentAddress;
//	}
//
//	public void setDepartmentAddress(String departmentAddress) {
//		this.departmentAddress = departmentAddress;
//	}
//
//	public String getDepartmentCode() {
//		return departmentCode;
//	}
//
//	public void setDepartmentCode(String departmentCode) {
//		this.departmentCode = departmentCode;
//	}
//
//	@Override
//	public String toString() {
//		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
//				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
//	}
//	
	

}
