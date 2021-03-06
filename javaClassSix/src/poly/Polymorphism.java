package poly;

public class Polymorphism {
	//Polymorphism does not rely on the body nor rely on the return type
		//Method Overload is a concept of polymorphism
			//whenever we want to create multiple method with the same name
			//we just need to differentiate these methods with different parameters
	
	
	public static void main(String[] args) {
		//the idea of Polymorphism is that you will not need to change the name of the method to 
		//in order to keep the same name method and be able to distinguish them,
		//create the same name method that takes different parameters
		//this is also known as "Method Overload" by distinguishing the methods by parameterization
		
		sum(7,5);
		sum("Hello", 8);
		
		//the substring() example below will show two types of substring functions
		//the difference is that the first one takes one variable
		//the second one takes two variables within its parameter
//		String a = "apple";
//		a.substring()

	}
	
	public static void sum() {
		System.out.println(5+5);
	}
	
	//if you have void in the public static void; then this will not return anything
	public static void sum(int a) {
		System.out.println(10+a);
	}
	
	public static void sum(int a, int b) {
		System.out.println(110+a);
	}
	
	
	public static void sum(String x, int y) {
		System.out.println(10+x);
	}
	
//	//public static int will let you return the int
//	public static int sum() {
//		return 10+10;
//	}
	
	

}
