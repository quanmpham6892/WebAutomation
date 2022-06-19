package conditions;

import java.util.Scanner;

public class IfandElse {

	public static void main(String[] args) {
		
//		int a = 10;
//		System.out.println(a);
//		 
//		int b = 20;
//		System.out.println(b);
//		
//		a=b;
//		System.out.println(a);
//		System.out.println("===================================================");
//		//condition
//		
//		int cost = 5;
//		int budget = 3;
		
		//Formula for if and else
		// if(comparison){
			// inside this curly brace will execute 
			//only if the IF comparison you give is TRUE
			//ELSE will be ignored if this holds true
		//  }
		// else{
		// inside this brace will execute if the IF comparison is FALSE
		//  }
		
//		if(cost <= budget) {
//			System.out.println("I can buy this");
//		}
//		else {
//			System.out.println("I cant afford this :_(");
//		}
//		
//		System.out.println("===================================================");
		
		//Using string function to put into your if else statement 
		//Boolean conditional statement
//		String c = "";
//		System.out.println(a);
//		
//		if(c.isEmpty()) {
//			c = "america";
//		}
//		else{
//			System.out.println(c);
//		}
		
		//Boolean example
		
//		String d = "Apple";
//		String e = "apple";
//		
//		if(d==e) {
//			System.out.println("They are equal");
//		}else {
//			System.out.println("They are not equal");
//		}
//		
//		//Another example using string function 
//		if(d.equalsIgnoreCase(e)) {
//			System.out.println("They are equal");
//		}else {
//			System.out.println("They are not equal");
//		}
		
		
		
//		System.out.println("===================================================");
		//Interview question: Whats the difference between == compared to equalsIgnoreCase
		//whenever you compare string, you should use .equalsIgnoreCase
		//Whenever you compare
		
//		String f = "elephant";
//		System.out.println("type in elephant");
//		Scanner ui = new Scanner(System.in);
//		String y = ui.next();
//		
//		if(f==y) {
//			System.out.println("equal");
//		}else {
//			System.out.println("not equal");
//		}
		//in this case, if the user types in elephant as the input, the statement will return false
		//this is due to the constant literal pool; meaning elephant cannot be used twice in its storage
		// == measures value AND storage!!!!
		//Now, if you only cares about the string, use .equalsIgnoreCase() you will get true 
		
		
		//ELSE IF statement
		System.out.println("What day is it?");
		Scanner ui = new Scanner(System.in);
		String day = ui.next();
		
		if(day.equalsIgnoreCase("monday")) {
			System.out.println("Go to work 1");
		}else if(day.equalsIgnoreCase("tuesday")) {
			System.out.println("Go to work 2");
		}else if(day.equalsIgnoreCase("wednesday")) {
			System.out.println("Go to work 3");
		}else if(day.equalsIgnoreCase("thursday")) {
			System.out.println("Go to work 4");
		}else if(day.equalsIgnoreCase("friday")) {
			System.out.println("Go to work 5");
		}else if(day.equalsIgnoreCase("saturday")) {
			System.out.println("Go to work 6");
		}else if(day.equalsIgnoreCase("sunday")){
			System.out.println("Go to church");
		}else {
			System.out.println("Thats not a day, stupid. Try again");
		}
		
		
		
		
		

	}

}
