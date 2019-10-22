package com.remanth.operators;

import java.util.Scanner;

public class ArthematicOperations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value ");
		int a= in.nextInt();
		System.out.println("enter b value");
		int b= in.nextInt();
		System.out.println("Addition =" +(a +b));
		System.out.println("sub =" +(a -b));
		System.out.println("Multi =" +(a *b));
		System.out.println("division =" +(a /b));
		System.out.println(" %=" +(a %b));
	}

}
