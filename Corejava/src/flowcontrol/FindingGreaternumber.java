package flowcontrol;

import java.util.Scanner;

public class FindingGreaternumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a value a ");
		int a= in.nextInt();
		System.out.println("enter a value b ");
		int b= in.nextInt();
		System.out.println("enter a value c ");
		int c= in.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
			
		else
		{
			if(b>c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}
}
}