package com.prowings.enum1;

import java.util.Scanner;

enum Week{
	
	MON,TUE,WED,THU,FRI,SAT,SUN
	
}


public class IsEnum {

	public static void main(String[] args) {
		Week[] w = Week.values();
		
	//System.out.println(Week.valueOf("MON"));	
	//String day;
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter day short form in caps");
//	day = sc.next();
		Week r = Week.MON;
		switch(r)
		{
		case MON:
			System.out.println("Monday");
			break;
		case TUE:
			System.out.println("Tuesday");
			break;
		case WED:
			System.out.println("Wednesday");
			break;
		case THU:
			System.out.println("Thursday");
			break;
		case FRI:
			System.out.println("Friday");
			break;
		case SAT:
			System.out.println("Saturday");
			break;
		case SUN:
			System.out.println("Sunday");
			break;
			default:
			System.out.println("Not a day");
			
	}
}}
