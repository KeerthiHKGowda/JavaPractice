import java.util.Scanner;

public class Paliandrome {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		
		int temp = number;
		int rev = 0;
		int rem;
		
		while(temp!=0) {
			rem = temp %10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		
		if (number == rev) {
			System.out.println("Number is paliandrome");
		}else {
			System.out.println("Number is not paliandrome");

		}
		
	}

}
