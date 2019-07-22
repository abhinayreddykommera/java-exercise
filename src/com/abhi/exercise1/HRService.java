package com.harsha.exercise1;


import java.util.ArrayList;
import java.util.List;

public class HRService extends HR {

	void addEmployee(Employee emp) {
		
		employees.add(emp);
	}
	
	int removeEmployee(int id) {
		int index = -1;
		int size = employees.size();
		for(int i=0;i<size;i++) {
			if(employees.get(i).employee_id == id) {
				index = i;
				break;
			}
		}
		if(index >= 0)employees.remove(index);
		return index;
	}
	
	List<Employee> search(String fName,String lName){
		List<Employee> emps = new ArrayList<Employee>();
		for(Employee emp:employees) {
			if(emp.firstName.equals(fName) && emp.lastName.equals(lName)) emps.add(emp);
		}
		if(emps.size() > 0) return emps;
		else {
			System.out.println("No employees found! Please modify search parameters.");
			return null;
		}
		
	}
	
	Employee search(int id) {
		int size = employees.size();
		for(int i=0;i<size;i++) {
			Employee emp = employees.get(i);
			if(i == size-1 && emp.employee_id != id) {
				System.out.println("No employee found! Please modify search parameter.");
				return null;
			}
			else {
				if(emp.employee_id == id)return emp;
			}
		}
		System.out.println("No employee found! Please modify search parameter.");
		return null;
	}
	
	void printEmployees() {
		for(Employee emp:employees) {
			System.out.println(emp.firstName+" "+emp.lastName);
		}
	}
}
