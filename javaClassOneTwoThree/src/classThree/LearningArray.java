package classThree;

import java.util.Arrays;

public class LearningArray {

	public static void main(String[] args) {
		//String toCharArray() - converts this string into character array
		
		int a = 10;
		
		
		//Array
		//Formula
		//Method 1: You know all the values in your array?
		//Lets say I have a java class, and I will let you register until the 16th of May. After that date, you will know all the people that have enrolled in your class.
			//DataType[] ArrayName = {value1, value,2, value3, value4};
		//NOTE: Once you have declare this
				//Index always starts at 0
				//Length will start at 1
		
		String[] students = {"Qaun","AivanPham","Khoa","Linh","Vy","Quan","Quan"};
		int[] grade = {56,73,85,55,99};
		
		//length will tell you how many values in your array, starting at 1 
		System.out.println(students.length);
		//inside this square brace, it will always be counted as index
		System.out.println(students[2]);
		System.out.println(students[3].toLowerCase());
		System.out.println(students[4].toUpperCase());
		System.out.println(students[5]);

		System.out.println(students[1].length());
		System.out.println(students[1].toUpperCase());
		
		
		
		
		//Method 2: You do know your values, but you don't know how many?
		//DataType[] ArrayName = new DataType[MaxItemCount];
		String[] noob = new String[5];
		
		noob[0]= "Linh";
		noob[1]= "Quan";
		noob[2]= "AiVan";
		noob[3]= "Khoa";
		noob[4]= "Vy";
		
		
		//In order to be able to print out the arrays above, you will first need to use Arrays.sort()
		Arrays.sort(noob);
		//Then you will be able to print out the desire array
		System.out.println(noob[1]);
		
		
		
		//toCharArray()
		//the result you will get once you manipulate the string and use the function toCharArray() 
		//result would be a character array 
		String d = "apple";
		char[] abc = d.toCharArray();
		
		//What code do I write to print out 'l'
		System.out.println(abc[3]);
		
		//If you want to convert the 'l' to uppercase
		//how would you write the code to do it
		//Trick Question: Character 'l' is a char, not a string for you to use the toUpperCase() String function
//		System.out.println(abc[3].toUpperCase());
		
		System.out.println( (abc[3] + "").toUpperCase() );
		
		
		
	}

}
