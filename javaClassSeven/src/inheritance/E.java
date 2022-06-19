package inheritance;

public class E {
		//Static and non static review
		//
	
	public static void main(String[] args) {
		// In order to call E1, all you have to do is call it because it is static and this main method is static as well
		//NOTE: If you make an update on a global variable and want everything else  to update the value 
			//everywhere else; you must make that global variable "static"
		
		
		E1();
		
		// In order to call E2, you must create an object because E2 is not static and this main method is static
		// "E" is the class name in this example; 
		 E e = new E();
		 e.E2();
		 
		 
		 //In order to call B1
		 
		 B.B1();
		 
		 //In order to call B2:
		 
		 B b = new B();
		 b.B2();
		 
		 //How do we get a global variable in B class
		 //NOTE: To access static variables, you should not use the object; rather you should use the class
		 
		 System.out.println(B.a);
		 
		 //How do we print b global variable in B class
		 
		 System.out.println(b.b);
	
		
		
		
		
		

	}
	
	public static void E1() {
		System.out.println("E1");
	}
	
	public void E2() {
		System.out.println("E2");
	}


}
