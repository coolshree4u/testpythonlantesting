package com.test;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		boolean b1=true;
		boolean b2=true;
		
		if((x==4) && !b2)
			System.out.println("1 ");
		System.out.println("2 ");
		if((b2=true) && b1)
			System.out.println("3 ");
	}

}