package com.reddy;

public class CloneMethod implements Cloneable{
	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethod c1=new CloneMethod();
		CloneMethod c2=(CloneMethod)c1.clone();
		System.out.println(c2);
		c2.i=999;
		c2.j=333;
		System.out.println(c2.i +"--"+c2.j);
		System.out.println(c1.j +"------"+ c1.i);
		System.out.println("new code added");
	}
}
