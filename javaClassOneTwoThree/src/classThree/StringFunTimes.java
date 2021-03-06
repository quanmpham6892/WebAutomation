package classThree;

public class StringFunTimes {

	public static void main(String[] args) {
		//Most used String Functions - When you are writing any method, use the functions below to ensure the string condition is there

		//String 
		String a = "apple";
		
		//Length()
		//String length() - length of the string
		//.length() method will count the string starting from 1 to the end of the sentence NOTE: including spaces
		System.out.println(a.length());
		//alternative way to use .length()
		System.out.println("apples are disgusting".length());
		
		
		//String - charAt()
		//String charAt() - returns a char value at the given index number
		//Important: when you're counting index, you always start at 0
		// APPLE -index 0 would be character A in this example
		//You will need to provide a number in the parentheses
		//the below example will print out the character at index 1, which is "p"
		//if I ever need a single character based on the index value, you will need to use charAt() method
		System.out.println(a.charAt(1));
		
		
		
		//concat()
		//String concat() - combines specified string at the end of this string at the end of this string
		//NOTE:this method will only accept a String as the dataType
		//the example below will give you "apple red"
		System.out.println(a.concat(" red"));
		//Now I want to print out "apple red Hello"
		System.out.println(a.concat(" red").concat(" Hello"));
		
		
		//contains()
		//String contains() - returns true if chars are found in the string
		//this method accept a string within its parameters
		//this will be a boolean statement
		System.out.println(a.contains("1"));
		//what would this return?
		System.out.println(a.contains("ap"));
		
		
		//startsWith()
		//String startsWith() - checks if this string starts with given prefix
		System.out.println(a.startsWith("ap"));
		
		
		
		//endsWith()
		//String endsWith() - checks if this string ends with given suffix
		System.out.println(a.endsWith("le"));
		
		
		
		
		//indexOf()
		//String indexOf() - returns index of given character value or substring
		//techonthenet.com/ascii/chart.php
		//the website above will show the number value associated with each letter or symbol
		//String indexOf() - returns index of given character value or substring
		//this statement accepts character type as well as string within its parameter
		System.out.println(a.indexOf('a'));
		//this will returns 1 because it will always give you the first one
		System.out.println('p');
		//this example will take the number value associated with the letter 'l' in the String a
		System.out.println(a.indexOf("108"));
		
		
		//isEmpty()
		//String isEmpty() - checks if this string is empty
		//is a boolean function
		System.out.println(a.isEmpty());
		
		
		//replace()
		//String replace() - returns a string replacing all the old char to new char
		System.out.println(a.replace("ap", "i"));
		//its important to remember that anything you do to the variable a will not change its value
		System.out.println(a);
		//IMPORTANT: Now if you want to really change the  variable a then you just need to declare the dataType again
		a = a.replace("ap", "5");
		System.out.println(a);
		
		
		
		//String toLowerCase() - returns the string in lowercase letter
		System.out.println(a.toLowerCase());
		
		//String toUpperCase() - returns the string in uppercase letter
		System.out.println(a.toUpperCase());
		
		
		
	
		//String trim() - eliminates leading and trailing spaces
		//trim will eliminate any extra space in the front but not in between
		//trim will eliminate any extra space in the end
		String b = "   ap  Ple    ";
		System.out.println(b.trim());
		//this can also be done  with replace()
		
		
		
		//String substring() - returns a part of the string
		//NOTE: THIS IS IMPORTANT Because WE WILL USE IT DAILY!!!
		//two types of substring. One accepts one parameter. Second one will accept two parameters
		//First type of substring():
		System.out.println(a.substring(2));
		
		//Second type of substring():
		System.out.println(a.substring(1, 3));
		
		

		
		//String equals() - compares the contents of two given strings
		//this will return a boolean
		System.out.println(a.equals("APPLE"));
		//String equalsIgnoreCase()
		System.out.println(a.equalsIgnoreCase("APPLE"));
		
		
	
		//String toCharArray() - converts this string into character array
		
	}

}
