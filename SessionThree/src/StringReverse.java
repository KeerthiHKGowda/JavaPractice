import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input string ");

		String inputString = sc.nextLine();
		String reverseString = "";
		for (int i = inputString.length() - 1; i>=0; i--) {
			reverseString = reverseString + inputString.charAt(i);
		}
		
		System.out.println("Reverse string is" + reverseString);

	}

}
