package flowcontrol;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value a ");
		int n= in.nextInt();
		int a;
		for(int i=1;i<=n;i++);
		{
			a=n%2;
			 if(a==0)
			 {
				 System.out.println(a);
			 }
			 
		}
		
	}

}
