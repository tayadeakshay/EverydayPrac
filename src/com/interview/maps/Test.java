package com.interview.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(10,"Ram","Mumbai");
		Employee e2 = new Employee(20,"Sham","Pune");
		Employee e3 = new Employee(30,"Sita","Pune");
		Employee e4 = new Employee(40,"Gita","Mumbai");
	
		List<Employee> l1 = new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		
		List<Employee> l2 = new ArrayList<>();
		List<Employee> l3 = new ArrayList<>();
		
		for(Employee list:l1)
		{
			if(list.city == "Mumbai")
			{
				l2.add(list);
			}
			else if(list.city == "Pune")
			{
				l3.add(list);
			}
			
		}
		
		Map<String,List<Employee>> m1 = new HashMap<>();
		m1.put("Mumbai",l2);
		m1.put("Pune", l3);
		
		System.out.println("Pune employees   : "+m1.get("Pune"));
		System.out.println("Mumbai employees : "+m1.get("Mumbai"));
	}
}
