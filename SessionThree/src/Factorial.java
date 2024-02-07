import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner intObj = new Scanner(System.in);
		int number = intObj.nextInt();
		int factorial = 1;
		for ( int i = number; i > 1; i--){
			factorial = factorial * i;
		}
		System.out.println("Factorial is " + factorial);

	}
}
