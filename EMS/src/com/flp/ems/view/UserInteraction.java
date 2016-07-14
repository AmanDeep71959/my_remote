package com.flp.ems.view;

import java.util.HashMap;
import java.util.Scanner;

import com.flp.ems.util.Validate;

import java.util.*;

public class UserInteraction {
	void AddEmployee(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the details of employee:");
		System.out.println("enter the Name");
		String name = sc.nextLine();  
		System.out.println("enter the kin_id");
		String kin_id = sc.nextLine();
		System.out.println("enter the email id");
		String email_id = sc.nextLine();
		System.out.println("enter the phone no.");
		long phone_no = sc.nextLong(); 
		System.out.println("enter the address");
		String address = sc.nextLine();
		System.out.println("enter the date of birth");		
        String bdate = sc.next();
		System.out.println("enter the date of joining");
		String jdate = sc.next();
		System.out.println("enter the department");
		String department = sc.nextLine();
		System.out.println("enter the project");
		String project = sc.nextLine();
		System.out.println("enter the roles");
		String roles = sc.nextLine();
	
        HashMap hm = new HashMap();
		
		if(Validate.validateDate(bdate) && Validate.validateDate(jdate))
		{
		  hm.put(1, name);
	      hm.put(2, kin_id);
	      hm.put(3, email_id);
	      hm.put(4, phone_no);
	      hm.put(5, address);
	      hm.put(6, bdate );
	      hm.put(7, jdate);
	      hm.put(8, department);
	      hm.put(9, project);
	      hm.put(10, roles);
		}
	}
	void ModifyEmployee(){
		
	}
	void RemoveEmployee(){
		
	}
	void SearchEmployee(){
		
	}
	void getAllEmployee(){
		
	}
	
	}
