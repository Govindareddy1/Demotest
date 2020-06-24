package com.reddy;

public class EqualsMethod {
	
	public String name;
	int age;
	public EqualsMethod(String name,int age) {
		
		
		this.name=name;
		this.age=age;
		
	}

	public static void main(String[] args) {
		EqualsMethod e1=new EqualsMethod("govind", 28);
		EqualsMethod e2=new EqualsMethod("reddy", 27);
		EqualsMethod e=new EqualsMethod("govind", 28);
		EqualsMethod e4=e1;
		EqualsMethod e5=e;
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e));
		System.out.println(e1.equals(e4));
		System.out.println(e1.equals(e5));
		
	}
	
}
