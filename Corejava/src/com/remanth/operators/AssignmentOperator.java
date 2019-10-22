package com.remanth.operators;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value ");
		int a= in.nextInt();
		a+=4;
		System.out.println(a);
		a-=8;
		System.out.println(a);
		a*=4;
		System.out.println(a);
		a/=5;
		System.out.println(a);
				
	}

}
