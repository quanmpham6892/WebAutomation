package conditions;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("What day is it?");
		Scanner ui = new Scanner(System.in);
		String day = ui.next();
		
		//switch is different because IF ELSE statements can deal with multiple variables; 
		//multiple variables means what you can put inside the ( ) conditional statement
		// day value is only one variable so it suites this switch conditional statement
		switch(day.toLowerCase()) {
		case"monday":
			System.out.println("monday 1");
			System.out.println("test test 1");
			break;
		case"tuesday":
			System.out.println("tuesday 2");
			System.out.println("test test 2");
			break;
		case"wednesday":
			System.out.println("wednesday 3");
			System.out.println("test test 3");
			break;
		case"thursday":
			System.out.println("thursday 4");
			System.out.println("test test 4");
			break;
		case"friday":
			System.out.println("friday 5");
			System.out.println("test test 5");
			break;
		case"saturday":
			System.out.println("saturday 6");
			System.out.println("test test 6");
			break;
		case"sunday":
			System.out.println("sunday 7");
			System.out.println("test test 7");
			break;
		default: 
			System.out.println("Thats not a day, stupid. Try again");
		}
			
		
		
		
	}

}
