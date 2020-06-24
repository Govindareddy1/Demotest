package com.reddy;

public class String1 {

	public static void main(String[] args) {
		
		String s="abc";
		s=s+2+2;
		s=s+(2+2);
		s.concat("1").concat("2");
		s.concat("" +2 +2);
		System.out.println(s);
		
		
	}
}
