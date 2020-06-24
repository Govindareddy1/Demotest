package com.reddy;

public class TostringMethod {
	
	String name;
	int rolnum;
	
	public TostringMethod(String name,int rolnum) {
		this.name=name;
		this.rolnum=rolnum;
	}
	// to string method 
	// return getClass().getName()+"@"+Integer.toHexString(hashcode());
	public String toString()
	{
		return name+"--"+rolnum;
	}
	
	public static void main(String args[])
	{
		TostringMethod t1=new TostringMethod("govind", 1);
		TostringMethod t2 =new TostringMethod("reddy", 2);
		System.out.println(t1.toString());
		System.out.println(t2);
	}

}
