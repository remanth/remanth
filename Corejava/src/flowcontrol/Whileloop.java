package flowcontrol;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		int a=1,fac =1;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value ");
		int n= in.nextInt();
		while(a<=n)
		{
			fac=fac*a;
			
			++a;
		}
		System.out.println(fac);
	}
}
