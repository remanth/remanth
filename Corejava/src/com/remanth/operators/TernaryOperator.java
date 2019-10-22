package com.remanth.operators;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number ");
		int a= in.nextInt();
		System.out.println("enter b number ");
		int b= in.nextInt();
		int min =(a<b)?a:b;
		System.out.println(min);
		
		
	}

}
