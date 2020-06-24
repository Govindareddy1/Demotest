package com.reddy;

public class StringMethod1 {
	
	public static void main(String[] args) {
		
		String s1= new String("govind");
		
		s1.concat("reddy");
		System.out.println(s1);
		
		String s2=new String("govind");
		String s3=s2;
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		
		System.out.println(s1==s3);
		
		StringBuffer sb=new StringBuffer("govinda");
		sb.append("reddy");
		System.out.println(sb);
		System.out.println(sb.append("123"));
		
		String st=new String("reddy");
		String st1="reddy";
	}

}
