package accessModifier;

//If we want to use something from a different package, we can import them using the syntax below
	//import inheritance.B;

//If we want to use something from a different package AND not specify which class we're trying to access, we can use "*"
	//import inheritance.*;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Access Modifier: This concept basically tells you what is accessible to what
	//Example Below: 
		//Access modifier = public, private, protected, default
			//default means it doesn't have: public, private, or protected
				//if you don't write anything, the code will recognize it as "default"
		//Static or non-static = static
		//Return Type = void
		//Name of Method = A1
		//Body of Method = Whatever that is in between the two curly braces; { } ; System.out.println("A1");
	
	public static void A1() {
		System.out.println("A1");
	}
	
	public void A2() {
		System.out.println("A2");
	}

}
