package flowcontrol;

import java.util.Scanner;

public class Mult {

	public static void main(String[] args) {
		int fac=1;
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value ");
		int n= in.nextInt();
		for(int a=1;a<=n;++a)
		{
			
			fac=fac*a;
		}
		System.out.println(fac);
	}

}
