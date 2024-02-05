import java.util.Scanner;

public class PrintingPatternOne {
	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner numObj = new Scanner(System.in);
		int numOfRows = numObj.nextInt();
		int spaceCount = numOfRows;
		for (int i = 1; i <= numOfRows; i++) {

			 for (int j = 1; j <= spaceCount ; j++)
	            {
	                System.out.print(" ");
	            }
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(i +" ");
			}
			System.out.println();
			spaceCount--;
		}
		
	}
}
