import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner intObj = new Scanner(System.in);
		int x= intObj.nextInt();
		
		Scanner intObjTwo = new Scanner(System.in);
		int y= intObjTwo.nextInt();
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(x);
		System.out.println(y);
	}
}
