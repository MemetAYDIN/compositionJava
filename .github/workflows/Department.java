package com.godoro.composition;

import java.util.List;

public class Department {
	
	private long depertamntId;
	private String depertamntName;
	private List<Employee> employeeList;
	
	
	
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public Department(long depertamntId, String depertamntName) {
		this.depertamntId = depertamntId;
		this.depertamntName = depertamntName;
	}
	public Department() {
	}
	public long getDepertamntId() {
		return depertamntId;
	}
	public void setDepertamntId(long depertamntId) {
		this.depertamntId = depertamntId;
	}
	public String getDepertamntName() {
		return depertamntName;
	}
	public void setDepertamntName(String depertamntName) {
		this.depertamntName = depertamntName;
	}
	

}
