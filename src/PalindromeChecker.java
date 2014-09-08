/* This class asks for a String and checks whether it's a palindrome */
import java.util.Scanner;
public class PalindromeChecker {
	public static void main(String[] args) {
		//Holds whether String is palindrome or not
		boolean palindrome = true;
		// Get String from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string");
		String testCase = input.next();
		// Start at end and beginning of string
		int high = testCase.length() - 1;
		int low = 0;
		// Convert String to String Array to iterate through
		String[] a = testCase.split("");
		// Go through the String array to test if palindrome
		while(low < high){
			// Not palindrome
			if(!a[low].equals(a[high])){
				palindrome = false;
				break;
			}
			low++;
			high--;
		}
		if(palindrome == true){
			System.out.println("The String is a palindrome");
		}
		else{
			System.out.println("The String is not a palindrome");
		}

	}
}
