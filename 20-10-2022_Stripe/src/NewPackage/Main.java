package NewPackage;
import java.util.Scanner; 
import java.util.Arrays;

/*
This problem was asked by Stripe.
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
You can modify the input array in-place.

Author: Conor Evans
 */
public class Main {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("How many numbers would you like to enter?");

	    int arraySize = userInput.nextInt();  // Read array size from user
	    
	    int inputNumbers[] = new int[arraySize];
	    
	    for(int i = 0; i < arraySize; i++) {
		    System.out.print("Your number at position " + (i + 1) + " is? ");
		    inputNumbers[i] = userInput.nextInt();	    //Prompt user for input numbers
	    }
	    userInput.close();

	    System.out.println("\nArray is: " + Arrays.toString(inputNumbers));
		Arrays.sort(inputNumbers);
	    System.out.println("\nSorted Array is: " + Arrays.toString(inputNumbers));
			    
	    System.out.print("Lowest missing positive integer is: " + lowestMissingPositiveInt(inputNumbers));
	}

	private static int lowestMissingPositiveInt(int[] inputNumbers) {
		int lowestMissingPositive = 1;
		
		for(int i = 0; i < inputNumbers.length; i++) {
			if((inputNumbers[i] - lowestMissingPositive) == 0){
				lowestMissingPositive++;
			}
		}
				
	    return lowestMissingPositive;
	}
}
