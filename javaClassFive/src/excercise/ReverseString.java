package excercise;

public class ReverseString {

	public static void main(String[] args) {
		// reverse a string
		//we count "tomorrow" starting with 0, all the way to 8
		String N = "tomorrow";
		//convert N to a character array; 
		//this will split each character inside N string 
		
		char[] nChar = N.toCharArray();
		
		String result = "";
		
		for(int i=N.length()-1; i>=0; i--) {
			result = result + nChar[i];
		}
		
		System.out.println(result);
		
		if(N.equals(result)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		
		

	}

}
