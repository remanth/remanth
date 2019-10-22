package flowcontrol;

import java.util.Scanner;

public class ArrayValuesPrint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value ");
		int n= in.nextInt();
		int[] a=new int[n];
		for(int i=0;n>i;i++)
		{
			a[i]=i+1;
			System.out.println(a[i]);
		}
	}

}
