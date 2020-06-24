package com.naveen;

public class StaticvsNonstatic {
	
	String name;
	static int age;
	
public void getName()
{
	System.out.println("get name...");
}
public static void display()
{
	System.out.println("dsiaply");
}

public static void main(String[] args) {
	
	age = 25;
	
	display();
	System.out.println(age);
	//System.out.println(name);
	
	StaticvsNonstatic.display();
	
	
}
}
