import java.util.Scanner;

public class PrintingPatternNine {

	public static void main(String[] args) {
		System.out.println("Enter the number rows");
		Scanner obj = new Scanner(System.in);
		int rowCount= obj.nextInt();
		int num = 1;
		for (int i = 1 ; i <= rowCount; i ++) {
			for (int j = i; j >=1 ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
