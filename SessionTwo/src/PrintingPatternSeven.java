import java.util.Scanner;

public class PrintingPatternSeven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("How Many Rows You Want In Your Pyramid?");

		int noOfRows = sc.nextInt();

		int rowCount = noOfRows;
 
	     for(int i = 1; i<=noOfRows; i++)
	     {
	          for(int j = 1; j<=i; j++)
	             {
	             System.out.print(j);
	             }       
	         if (i > 1)
	         {
	         for(int k = i; k>1; k--)
	             {
	             System.out.print(k-1);
	             }
	         }
	         System.out.println();
	     }

	}

}