package com.harsha.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FullTime extends Employee {

	public Calendar start;
	public double baseSalaryPerYear;
	public double bonusPerYear;
	
	void fillFullTime() {
		String strDate;
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YYYY");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("What is the start date(MM-dd-YYYY):");
			strDate = br.readLine();
			Date date = sdf.parse(strDate);
			start = Calendar.getInstance();
			start.setTime(date);
			System.out.println("What is the base salary per year:");
			baseSalaryPerYear = Double.parseDouble(br.readLine());
			System.out.println("What is the bonus per year:");
			bonusPerYear = Double.parseDouble(br.readLine());
			//br.close();
		}catch(IOException | ParseException e) {
			e.printStackTrace();
		}		
	}
}
