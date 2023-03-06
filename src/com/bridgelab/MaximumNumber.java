package com.bridgelab;

import java.util.Scanner;

public class MaximumNumber {
	public static <T extends Comparable<T>> T MaxInteger(T a, T b, T c) {
		T max = a; // intializing a is max
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter first number");
     int a=sc.nextInt();
     System.out.println("enter second number");
     int b=sc.nextInt();
     System.out.println("enter third number");
     int c=sc.nextInt();
     
     Integer max=MaxInteger(a, b,c);
     System.out.println("Maximum number is: "+max);
     
	}

}
