
import java.util.Scanner;

public class armstrongNumber
    {
    public static void main(String[] args)
    {
    	 System.out.println("Enter number");
    	 Scanner intObj = new Scanner(System.in);
    	 int number = intObj.nextInt();  
    	 System.out.println(number);
    	 
    	 int copyOfNumber = number;
    	 
         int noOfDigits = String.valueOf(number).length();
  
         int sum = 0;
  
         while (copyOfNumber != 0)
         {
             int lastDigit = copyOfNumber % 10;
  
             int lastDigitToThePowerOfNoOfDigits = 1;
  
             for(int i = 0; i < noOfDigits; i++)
             {
                 lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
             }
  
             sum = sum + lastDigitToThePowerOfNoOfDigits;
  
             copyOfNumber = copyOfNumber / 10;
         }
  
         if (sum == number)
         {
             System.out.println(number+" is an armstrong number");
         }
         else
         {
             System.out.println(number+" is not an armstrong number");
         }
    }
}