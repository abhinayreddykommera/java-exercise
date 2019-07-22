package com.harsha.exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Contractor extends Employee {

	public Calendar start;
	public Calendar end;
	public double hourlyRate;
	
	void fillContractor() {
		String strDate;
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YYYY");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("What is the start date(MM-dd-YYYY):");
			strDate = br.readLine();
			Date date = sdf.parse(strDate);
			start = Calendar.getInstance();
			start.setTime(date);
			System.out.println("What is the end date(MM-dd-YYYY):");
			strDate = br.readLine();
			date = sdf.parse(strDate);
			end = Calendar.getInstance();
			end.setTime(date);
			System.out.println("What is hourly rate:");
			hourlyRate = Double.parseDouble(br.readLine());
			//br.close();
		}catch(IOException | ParseException e) {
			e.printStackTrace();
		}		
	}
}
