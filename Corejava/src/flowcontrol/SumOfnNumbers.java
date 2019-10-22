package flowcontrol;

import java.util.Scanner;

public class SumOfnNumbers {
	public static void main(String[] args) {
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value ");
		int n= in.nextInt();
		for(int a=1 ;a<=n;++a)
		{
			sum=sum +a;
		}
		System.out.println(sum);
	}


}
