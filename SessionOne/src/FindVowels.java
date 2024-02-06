import java.util.Scanner;

public class FindVowels {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string ");
		String inputString = sc.nextLine();
		
		boolean isPresent = false;
		for(int i = 0; i< inputString .length(); i++) {
			if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'e' || inputString.charAt(i) == 'i'|| 
					inputString.charAt(i) == 'o'|| inputString.charAt(i) == 'u') {
				isPresent = true;
			}
		}
		
		if (isPresent == true) {
			System.out.println("Vowel Present");
		}else {
			System.out.println("Vowel not Present");
		}
    }
}
