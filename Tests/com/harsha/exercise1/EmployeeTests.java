package com.harsha.exercise1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTests {

	Employee employee;
	@Before
	public void setup() {
		employee = new Employee();
		
	}
	
	@Test
	public void testforEmployeeEntities() {
		employee.fillEmployee();
		employee.fillCompany();
		employee.fillPhone();
		employee.fillAddress();
		employee.fillRoles();
		assertEquals(employee.employee_id,1);
		assertEquals(employee.firstName,"Harsha");
		assertEquals(employee.lastName,"Kovalluri");
		
		assertEquals(employee.company.company_id,1);
		assertEquals(employee.company.company_name,"IMCS");
		
		assertEquals(employee.phone.phone_id,1);
		assertEquals(employee.phone.areaCode,"513");
		assertEquals(employee.phone.phoneNumber,"3021051");
		assertEquals(employee.phone.countryCode,"1");
		
		assertEquals(employee.address.address_id,1);
		assertEquals(employee.address.city,"Irving");
		assertEquals(employee.address.country,"USA");
		assertEquals(employee.address.line1,"1026 san jacinto dr");
		assertEquals(employee.address.line2,"1714");
		assertEquals(employee.address.state,"TX");
		assertEquals(employee.address.zip,"45324");
		
		
		assertEquals(employee.roles.get(0).role_id,1);
		assertEquals(employee.roles.get(0).role_name,"Developer");
		
		//fail("Not yet implemented");
	}

}
