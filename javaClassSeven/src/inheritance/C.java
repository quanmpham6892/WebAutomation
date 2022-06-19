package inheritance;

	//"final" keyword would stop the inheritence.
	//"final" keyword can be place in front of public class C to stop the inheritence from happening
	//if we use this keyword, B class would throw an error because it cannot inherit anything from class C. This is an IMPORTANT concept! INTERVIEW QUESTION
		//Note: An alternative way to use methods in class C if we declare it "final" would be creating an object to call C class 
	//Example:
	// final public class C(){
	//	}


	//INTERVIEW QUESTION: How can I stop "method override"?
		//ANSWER: We can put "final" keyword in a method instead of a class
			//EXAMPLE: "final public static void C1(){
			//	   }

public class C {
	
	public static void C1() {
		System.out.println("C1");
	}
	
	public void C2() {
		System.out.println("C2");
	}

}
