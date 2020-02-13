package com.godoro.composition;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		Department departmentA=new Department(301,"Muhasebe");
		departmentA.setEmployeeList(new ArrayList<Employee>());
		
		Employee employee1=new Employee(601,"Neşet Ertaş",5435);
		employee1.setDepartment(departmentA);
		departmentA.getEmployeeList().add(employee1);
		
		
		Employee employee2=new Employee(601,"Neşet Ertaş",5435);
		employee2.setDepartment(departmentA);
		departmentA.getEmployeeList().add(employee2);
		
		Employee employee3=new Employee(601,"Neşet Ertaş",5435);
		employee3.setDepartment(departmentA);
		departmentA.getEmployeeList().add(employee3);
		
		System.out.println(departmentA.getDepertamntId()+" "+departmentA.getDepertamntName());
		
		for(Employee employee:departmentA.getEmployeeList())
		{
			System.out.println("\t"+employee.getEmployeeId()+" "
		+employee.getEmployeeName()
		+" "+employee.getMonthlySalary()+" "
		+employee.getDepartment().getDepertamntId()+" "
		+employee.getDepartment().getDepertamntName());
		}
	}

}
