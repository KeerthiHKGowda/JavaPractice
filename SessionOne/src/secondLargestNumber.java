
public class secondLargestNumber
{
    public static void main(String[] args)
    {
    	
    	int[] input =  {45, 51, 28, 75, 49, 42};
        int firstLargest, secondLargest;
 
 
        if(input[0] > input[1])
        {
     
            firstLargest = input[0];
 
            secondLargest = input[1];
        }
        else
        {
      
            firstLargest = input[1];
 
            secondLargest = input[0];
        }
 
  
        for (int i = 2; i < input.length; i++)
        {
            if(input[i] > firstLargest)
            {
 
                secondLargest = firstLargest;
 
                firstLargest = input[i];
            }
            else if (input[i] < firstLargest && input[i] > secondLargest)
            {
 
            	secondLargest = input[i];
            }
        }
        System.out.println(secondLargest);
    }
    	
 
}