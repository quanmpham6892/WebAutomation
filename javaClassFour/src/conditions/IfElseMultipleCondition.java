package conditions;

public class IfElseMultipleCondition {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 5;
		
		//AND statement
		//both statements in this if statement has to hold true for this to print "Test"
		if(a<b && a<c) {
			System.out.println("Test");
		}else {
			System.out.println("false");
			}
		
		
		//OR conditionk
		//as long as one of these statement holds true, then this statement will print "Test"
		if(a<b || a<c) {
			System.out.println("Test");
		}else {
			System.out.println("false");
			}
		
		
		//Class 4: 1 hour 43 minutes in: 20 mins left to completion
		
		
		
	}

}
