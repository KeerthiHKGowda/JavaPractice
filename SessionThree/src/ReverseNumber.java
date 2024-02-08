import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner intObj = new Scanner(System.in);
		int number = intObj.nextInt();
		
		int numberOfDigits = String.valueOf(number).length();
		int rev= 0, rem;
		
		
		while(number!=0) {
			rem = number%10;
			rev = rev*10 + rem;
			number = number/10;
		}
		
		System.out.println("Reverse number" + rev);

	}
}
