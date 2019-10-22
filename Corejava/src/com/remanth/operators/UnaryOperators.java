package com.remanth.operators;

import java.util.*;

/**
 * @author remanth
 *
 */
public class UnaryOperators {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number ");
		int a= in.nextInt();
		System.out.println("prefix Operator" + ++a);
		System.out.println(a);
		System.out.println("postfix operator" + a--);
		System.out.println(--a - ++a);
		System.out.println(a-- + a--);
		System.out.println(~a);
		System.out.println("enter b number ");
		int b= in.nextInt();
		System.out.println(~b);
		
		
	}

}
