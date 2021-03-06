package variable;

public class GlobalLocal {
	
	//Anything in the class level has the option of being "static" or "non static"
	//This means that if the global variable you declare is not static, 
	//If you want to access a non static variable and you want to bring it in the method
	//You should always create an object inside the method to grab the global variable
	//Int a below is class level AKA global, and also non-static
	// int a = 55;
	//now we change the variable above to static by adding "static" in front of the int declaration
	static int a = 55;
	
	
	public static void main(String[] args) {
		//In order to use a variable in different methods, the variable must be global
		//"Instance Level Variables" means they are inside the class but not within any method;
		//variables inside these methods are "local variables"
		//if you have both local and global variables, the code will pick up the local level first
		
		//if you want to create an object to get the non static variable, then you will need to get an instance of the class
		
		GlobalLocal xyz = new GlobalLocal();
		//now you can use the xyz instance to access the non static global variable 
		
		System.out.println(a);
		int a = 10;

		System.out.println(a);

	}
	
	
	
	public static void test() {
		System.out.println(a);
	}

}
