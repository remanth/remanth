package com.remanth.operators;

import java.util.Scanner;

public class Shiftoperators {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number ");
		int a= in.nextInt();
		System.out.println(a<<4);
		System.out.println(a>>6);
		}
}
