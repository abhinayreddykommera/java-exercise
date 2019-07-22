package com.harsha.exercise1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DemoTest {

	Employee employee;
	HRService hr;
	@Before
	public void setup() {
		employee = new Employee();
		hr = new HRService();
	}
	
	@Test
	public void test() {
		employee.fillEmployee();
		employee.fillCompany();
		employee.fillPhone();
		employee.fillAddress();
		employee.fillRoles();
		
		hr.company = employee.company;
		assertEquals(hr.company.company_id,1);
		assertEquals(hr.company.company_name,"IMCS");
		
		hr.addEmployee(employee);
		assertEquals(hr.employees.get(0),employee);
		assertEquals(hr.employees.size(),1);
		
		assertEquals(hr.search(1),employee);
		//assertNull(hr.search(5));
		
		assertEquals(hr.search("Harsha","Kovalluri").get(0),employee);
		assertEquals(hr.search("Harsha","Kovalluri").size(),1);
		
		assertEquals(hr.removeEmployee(1),0);
		assertEquals(hr.removeEmployee(5),-1);
		
		
		//fail("Not yet implemented");
	}

}
