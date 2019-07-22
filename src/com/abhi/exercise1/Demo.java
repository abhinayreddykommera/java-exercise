package com.harsha.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		HRService hr= new HRService();
		
		String read;
		Employee employee = new Employee();
		System.out.println("Is the employee a Contractor or fullTime employee?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			read = br.readLine();
			if(read.equals("Contractor")) {employee = new Contractor();}
			else {employee = new FullTime();}
			//br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		employee.fillEmployee();
		employee.fillCompany();
		hr.company = employee.company;
		employee.fillPhone();
		employee.fillAddress();
		employee.fillRoles();
		System.out.println(employee);
		hr.addEmployee(employee);
		System.out.println("Employee added");
		hr.printEmployees();
		System.out.println("Done");
		
		Employee xyz = hr.search(1);
		System.out.println(xyz.firstName+" "+xyz.lastName);
		List<Employee> lst = hr.search("a","s");
		xyz = lst.get(0);
		System.out.println(xyz.firstName+" "+xyz.lastName+" Done!");
		System.out.println(hr.removeEmployee(1));
		hr.printEmployees();
		
	}

}
