package com.xworkz.java.Arrays.ArrayMethods;

import java.util.Arrays;

public class ArrayMethodsSample {
	public static void main(String[] args) {
		Object[] obj=new Object[10];
		obj[0]=1;
		obj[1]=3;
		obj[2]=7;
		obj[3]=5;
		obj[4]=7;
		obj[5]=11;
		obj[6]=11;
		obj[7]=13;
		obj[8]=13;
		obj[9]=17;
		
	/*	System.out.println("before Sorting...."+"\n"+Arrays.toString(obj));
		Arrays.sort(obj); // it does not return anything thats why it is not in sop
		System.out.println("after Sorting...."+"\n"+Arrays.toString(obj));
		System.out.println("copy of : "+Arrays.toString(Arrays.copyOf(obj,3)));
		System.out.println("copy of range : "+Arrays.toString(Arrays.copyOfRange(obj, 1, 8)));
		System.out.println("Search method : "+Arrays.binarySearch(obj, 7));
		Arrays.fill(obj, 9); //  it does not return anything thats why it is not in sop
	*/	System.out.println("fill method : "+Arrays.toString(obj));
		System.out.println("search method after fill method : "+Arrays.binarySearch(obj, 7));
	}
}
