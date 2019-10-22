
public class Animal {

		String name;//instance variable
		int weight;//instance variable
		static String breed;//static variable
		public void eat()//method
		{
			System.out.println("eating");
			System.out.println(name+weight);
		}
		    public Animal()//Constructor
		    {
				System.out.println("Animal");
			}
		    public int getweight() 
		    {	
		    	return weight;
		    }	
		    public Animal(String name)
		    {
		    	this.name=name;
		    }
		    public Animal(String name,int weight)
		    {
		    	this.name=name;
		    	this.weight=weight;
		    }
		    public static void main(String[] args) {
		    	  Animal a1=new Animal();
				    Animal.breed="German sheperd";
				    a1.name = "puppy";
				    a1.weight=20;
				    a1.eat();
					System.out.println(Animal.breed);
					int weight1=a1.getweight();
					a1.breed="dolmation";
					Animal a2=new Animal("scooby");
					Animal a3=new Animal("kutty",30);
					System.out.println(a2.getweight() + a2.name);
					System.out.println(a2.breed);
					System.out.println(a3.getweight()+a3.name);
					System.out.println(a3.breed);
					System.out.println(a1.getweight() +a1.name);
				
			}
			public void sleep() {
				System.out.println("Sleeping");	
			}
		  


}
			

		    

