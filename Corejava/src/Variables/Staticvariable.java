package Variables;

public class Staticvariable {
	static int x=50;
	static double d;
	int a=100;
	double s; 
	public static void main(String[] args) {
		int a=590;
		Staticvariable t1= new Staticvariable();
		Staticvariable t2= new Staticvariable();
		t1.a=10;
		t2.a=20;
		System.out.println(t1.a);//10
		System.out.println(t2.a);//20
		System.out.println("======");//
		Staticvariable.x=30;
		System.out.println(t1.a);//30
		System.out.println(t2.a);//30
		System.out.println(t1.x);//30
		System.out.println(t2.x);//0
		System.out.println("======");
		Staticvariable.x=40;
		System.out.println(t1.a);//40
		System.out.println(t2.a);//40
		System.out.println(t1.x);//40
		System.out.println(t2.x);//40
		

	}

}
