package classThree;

import java.util.Arrays;

public class LearnSplit {

	public static void main(String[] args) {
		
		//At first, this value is a String
		String value = "Quan, AiVan, Khoa, Vy, Linh";
		
		//After you split, the type will be String Array
		String[] names = value.split(",");
		
		System.out.println(names.length);
		
		System.out.println(names[0]);
		
		System.out.println(value);
		//How do I print out the first name in the value array above
		Arrays.sort(names);
		System.out.println(names[0].trim());
	}

}
