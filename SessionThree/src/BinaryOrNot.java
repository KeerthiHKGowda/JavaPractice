import java.util.Scanner;

public class BinaryOrNot {
	public static void main(String[] args) {

		{
			System.out.println("Enter number");
			Scanner intObj = new Scanner(System.in);
			int number = intObj.nextInt();
			boolean isBinary = true;

			int copyOfNumber = number;

			while (copyOfNumber != 0) {
				int temp = copyOfNumber % 10; // Gives last digit of the number

				if (temp > 1) {
					isBinary = false;
					break;
				} else {
					copyOfNumber = copyOfNumber / 10; // Removes last digit from the number
				}
			}

			if (isBinary) {
				System.out.println(number + " is a binary number");
			} else {
				System.out.println(number + " is not a binary number");
			}
		}

	}
}