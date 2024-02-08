import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		
		Scanner Obj = new Scanner(System.in);

		System.out.println("Enter number");
		int number= Obj.nextInt();
		int numOne = 0;
		int numTwo = 1;
		int sum;
				
		System.out.println(numOne);
		System.out.println(numTwo);

		for (int i = 3; i <= number; i++ ) {
			
			sum = numOne+numTwo;
			System.out.println(sum);
			numOne= numTwo;
			numTwo = sum;
					
		}

	}
}
