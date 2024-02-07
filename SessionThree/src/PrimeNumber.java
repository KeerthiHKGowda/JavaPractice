import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner intObj = new Scanner(System.in);
		int number = intObj.nextInt();
		int temp = 0, i  ;
		for (i=2; i<number-1; i++) {
			if (number%i == 0) {
				System.out.println("Given number is not Prime");
				temp = 1;
				break;
			}
		}
		if (temp == 0) {
			System.out.println("Given number is Prime");
		}
	}

}
