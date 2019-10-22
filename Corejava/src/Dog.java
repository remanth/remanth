
 class Dog extends Animal
 {
	 public void sleep(){
		 System.out.println("Dog Sleeping");		 
	 }
	 public void bark()
	 {
		 System.out.println("Dog Barking");
	 }
public static void main(String[] args) {
	
  Animal a=new Animal();
  a.eat();
  a.sleep();
  Dog d=new Dog();
  d.eat();
  d.sleep();
  d.bark();
  Animal a2=new Dog();
  a2.sleep();
  a2.eat();
 }
 }  
 