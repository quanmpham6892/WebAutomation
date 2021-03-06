package inheritance;
	//"final" keyword would stop the inheritence
public class A extends B {
		//In this class, A class inherit from B class; A is the sub class which is the child; B is the super class which is the parent class
	

	public static void main(String[] args) {
		//Object Oriented Programming
		//Inheritance(Extends): Parent-child relationship between classes
			//if the child class inherit from the parent, whatever that child has will have in addition to what the parent has
			//if the child were to inherit from the parent, the keyword to go from the child class to the parent class is call "Extends"
			//extends keyword allow you to inherit from parent class
		//Parent is known as the "Super" class; the child is the "Sub" class
		//In inheritance rule, your sub class to the super class; meaning the child cannot say I'm going to inherit from multiple parents
			//A cannot extend to B, and extend to C, and extend to D at the same time; In this example, you can only choose one
		
		
		
		A1();
		
		A a = new A();
		
		a.A2();
		
		
		//Using the concept of inheritance, we just need to call B1 like this:
		B1();
		
		
		//Inheritance Chain: If B class extends to C class then A class will have everything in class B and class C
		//NOTE: We cannot do a circle inherit chain in coding; Example: A extends B, B extends C, C cannot extends B.... This would create a circle 

		C1();
		a.C2();
		
		//METHOD OVERRIDE: Lets say I want my own B1 method in my own class; the code below will grab my own B1 method, not the class B
			//This is the concept of "Inheritence"
		B1();
		
		
		//"SUPER" keyword is important in inheritence 
		//"this" keyword can just be used once. "this" keyword can only be use in a NON-STATIC environment

		//"this" keyword is used in "constructor" chaining
			//"this" keyword can just be used once. "this" keyword can only be use in a NON-STATIC environment
			//constructors cannot EVER be "static"!!!
		
		
		
		
		
		

	}
	
	public static void A1() {
		System.out.println("A1");
	}
	
	public void A2() {
		System.out.println("A2");
		
		//If I want to call B2 from this method, we must now create an object to call B2:
		//The code below will print my own version of B2
		A a = new A();
		a.B2();
		
		//"SUPER" keyword can only be used in a NON-STATIC method!!! MUST REMEMBER THIS CONCEPT
		//The code below will print B2 from class B
		//An alternative to the code below. If I want to call my parent's B2 method and don't want to use super, I can just create an object to call B2
		//If I didn't use inheritence, the super keyword will not be able to call from class B2
		super.B2();
		
	}
	
	public static void B1() {
		System.out.println("MY OWN B1");
	}
	

}
