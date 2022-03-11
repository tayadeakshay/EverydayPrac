package com.prowings.overload;

public class NewOver {

	public static void run(char c)
	{
	System.out.println("char: "+c);	
	}
	public static void run(String s)
	{
	System.out.println("String: "+s);	
	}
	public static void run(int i)
	{
	System.out.println("int: "+i);	
	}
	
	public static void main(String[] args) {
		
	run('a');	
	}
}
