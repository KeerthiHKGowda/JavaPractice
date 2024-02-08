import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to check whether it is perfect or not");
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		int sum=0;
		for(int i = 1; i<number; i++) {
			if(number%i == 0) {
				sum = sum + i;
			}
		}
		
		if (sum == number) {
			System.out.println("Entered number is perfect");
		}else {
			System.out.println("Entered number is not perfect");
		}
	}
}
