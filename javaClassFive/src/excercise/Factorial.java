package excercise;

public class Factorial {

	public static void main(String[] args) {
		// 
		int N = 5;
		
		int result = 0;
		
		//this loop will run 5 times because N = 5;
		//each time this loop runs, the result will add 5 to its bucket
		for(int i=0; i<=N; i++) {
			result = result + N;
		}
		System.out.println(result);
		
		
		// how do you add 5+4+3+2+1
		// in this scenario, we do 1>0 because we are only adding numbers so we do not need to include 0
		// adding a 0 will not make any difference and will be no point in doing it
		int M = 5;
		int sum = 0;
		for(int i=M; i>0; i--) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		

	}

}
