package com.prowings.everyday;

import java.util.Comparator;
import java.util.TreeSet;

public class IsComparator {
	public static void main(String[] args)
	{
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add("A");
		t1.add("AB");
		t1.add("AA");
		t1.add("ABC");
		t1.add("AAAA");
		System.out.println(t1);
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = (String)obj2;
		int l1= s1.length();
		int l2= s2.length();
		
		if(l1==l2)
			return -s1.compareTo(s2);
		
		if(l1<l2)
			return -1;
		else if(l1>l2);
		return +1;
		
	}
}