package com.harsha.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Employee{
	
	public int employee_id;
	public String firstName;
	public String lastName;
	
	Company company = new Company();
	List<Role> roles = new ArrayList<Role>();
	Phone phone = new Phone();
	Address address = new Address();
	
	void fillEmployee() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter Employee's first name:");
			firstName = br.readLine();
			System.out.println("Please enter Employee's Last name:");
			lastName = br.readLine();
			System.out.println("Please enter Employee id:");
			employee_id = Integer.parseInt(br.readLine());
			//br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void fillCompany() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter Company name:");
			company.company_name = br.readLine();
			System.out.println("Please enter Company id:");
			company.company_id = Integer.parseInt(br.readLine());
			//br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void fillPhone() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter Phone id:");
			phone.phone_id = Integer.parseInt(br.readLine());
			System.out.println("Please enter area code:");
			phone.areaCode = br.readLine();
			System.out.println("Please enter phone number:");
			phone.phoneNumber = br.readLine();
			System.out.println("Please enter country code:");
			phone.countryCode = br.readLine();
			//br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void fillAddress() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter Address id:");
			address.address_id = Integer.parseInt(br.readLine());
			System.out.println("Please enter zip code:");
			address.zip = br.readLine();
			System.out.println("Please enter country:");
			address.country = br.readLine();
			System.out.println("Please enter state:");
			address.state = br.readLine();
			System.out.println("Please enter city:");
			address.city = br.readLine();
			System.out.println("Please enter line 1:");
			address.line1 = br.readLine();
			System.out.println("Please enter line 2:");
			address.line2 = br.readLine();
			//br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void fillRoles() {
		int number;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("How many roles does the employee has?");
			number = Integer.parseInt(br.readLine());
			for(int i = 0;i < number;i++) {
				Role role = new Role();
				System.out.println("Please enter role id:");
				role.role_id = Integer.parseInt(br.readLine());
				System.out.println("Please enter role name:");
				role.role_name = br.readLine();
				roles.add(role);
			}
			//br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
