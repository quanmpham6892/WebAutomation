package review;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		//1. next() example:
		//System.out.println("What is your name?");
		//Scanner abc = new Scanner(System.in);
		//abc.next();
		
		//2. nextLine() example:
		//System.out.println("What is your name first name?");
		//Scanner userInput = new Scanner(System.in);
		//String fName = userInput.nextLine();
		//System.out.println("Nice to me you" + " " + fName + "! Now, what is your name last name?");
		//String lName = userInput.nextLine();
		//System.out.println("Hello" + " " + fName + " " + lName + ", welcome to your interactive dashboard.");
		
		//3. nextInt() example:
		System.out.println("What is your salary?");
		Scanner userInput = new Scanner(System.in);
		int valueInt = userInput.nextInt();
		if(valueInt<50000) {
			System.out.println("Wow, you're really poor!");
		}else {
			System.out.println("Not bad, you're making more than the average person in the US today. You should be proud!");
		};
		
//		abc.nextDouble();
		
		

	}

}
