import java.util.Scanner;
public class PrintingPatternThree {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner numObj = new Scanner(System.in);
		int numOfRows = numObj.nextInt();
		int spaceCount = numOfRows *2;
		int rowCount = 1;
		for (int i = 1; i <= numOfRows; i++) {

			 for (int j = 1; j <= spaceCount ; j++)
	            {
	                System.out.print(" ");
	            }
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(j+" ");
			}
			
			 for (int j = rowCount-1; j >= 1; j--)
	            {               
	                System.out.print(j+" ");            
	            }  
			 
			System.out.println();
			spaceCount = spaceCount - 2;
			rowCount++;
		}
	}

}
