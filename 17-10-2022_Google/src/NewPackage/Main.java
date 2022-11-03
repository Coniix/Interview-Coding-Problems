package NewPackage;
import java.util.Scanner; 
import java.util.Arrays;
 
/*
This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?

Author: Conor Evans
 */
public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("How many numbers would you like to enter?");

	    int arraySize = userInput.nextInt();  // Read array size from user
	    
	    int inputNumbers[] = new int[arraySize];
	    
	    //Prompt user for input numbers
	    for(int i = 0; i < arraySize; i++) {
		    System.out.print("Your number at position " + (i + 1) + " is? ");
		    inputNumbers[i] = userInput.nextInt();	    
	    }
	    
	    System.out.println("\nArray is: " + Arrays.toString(inputNumbers));
	    
	    //Read value for k
	    System.out.println("Enter a value for k: ");

	    int k = userInput.nextInt();  // Read array size from user
	    userInput.close();
	    
	    isThereSumToK(inputNumbers, k);
	}

	private static void isThereSumToK(int[] inputNumbers, int k) {
		//Loop through inputNumbers and determine if any combinations sum to k
		for(int i = 0; i < inputNumbers.length; i++) {
			for(int j = i; j < inputNumbers.length; j++) {
				if((inputNumbers[i] + inputNumbers[j]) == k) {
				    System.out.println("\nThe numbers " + inputNumbers[i] + " and " + inputNumbers[j] + " sum to k = " + k);
				}
			}
		}		
	}
}
