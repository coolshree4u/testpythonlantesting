package com.test;

import java.util.Arrays;

public class Test24 {

	public static void main(String[] args) {
		String [] colors={"blue","red","green","yellow","orange"};
		Arrays.sort(colors);
		int s2=Arrays.binarySearch(colors, "orange");
		int s3=Arrays.binarySearch(colors, "violet");
		System.out.println(s2+" "+s3);
	}

}
