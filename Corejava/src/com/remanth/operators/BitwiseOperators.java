package com.remanth.operators;

import java.util.Scanner;

public class BitwiseOperators {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number ");
		int a= in.nextInt();
		System.out.println("enter b number ");
		int b= in.nextInt();
		System.out.println("enter c number ");
		int c= in.nextInt();
		System.out.println(a<b&&a<c);
		System.out.println(a<b&a++<c);
		System.out.println(a>b||a++<c);
		
	}
}
