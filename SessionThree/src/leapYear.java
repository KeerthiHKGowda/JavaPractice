import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner intObj = new Scanner(System.in);
		int year = intObj.nextInt();
	
		boolean isLeapYear = false;
		if(year%4 == 0) {
		if (year % 100 == 0) {
			if(year % 400 == 0)
				isLeapYear = true;
			else 
			    isLeapYear = false;
		}
		else {
			isLeapYear = false;	
		}
		}
		System.out.println(isLeapYear);
	}
}
