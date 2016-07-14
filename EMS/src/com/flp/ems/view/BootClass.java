package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {

static void menuselection(int n){
	
			switch (n) {
	case 1 : UserInteraction u1 = new UserInteraction();
	             u1.AddEmployee();
	     	     break;
	case 2 : UserInteraction u2 = new UserInteraction();
                 u2.ModifyEmployee();
                 break;
	     
	 case 3 : UserInteraction u3 = new UserInteraction();
                 u3.RemoveEmployee();
                 break;
	     
	 case 4 : UserInteraction u4 = new UserInteraction();
	              u4.SearchEmployee();
	              break;
	 case 5: UserInteraction u5 = new UserInteraction();
	             u5.getAllEmployee();
	             break;
	             }
		
	}

public static void main(String[] args)
{
	System.out.println("1.void AddEmployee()"
			+ "2.void ModifyEmployee()/n" 
			+ "3.void RemoveEmployee()/n"
			+ "4.void SearchEmployee()/n"
			+ "5.void getAllEmployee()/n" );
	
	Scanner sc = new Scanner(System.in);  
    int n = sc.nextInt();  
    
   menuselection(n);
}
}

