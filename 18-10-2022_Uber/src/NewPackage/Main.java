package NewPackage;
import java.util.Scanner; 
import java.util.Arrays;
 
/*
This problem was asked by Uber.
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?

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
	    
	    System.out.println("\nArray is: " + Arrays.toString(inputNumbers));
	    userInput.close();
	    
	    productOfArrayNumbers(inputNumbers);
	}

	private static void productOfArrayNumbers(int[] inputNumbers) {
		//Define productArray as long and not int to accomodate for larger data sets/products
		long productArray[] = new long[inputNumbers.length];
		
		//Loop through productArray
		for(int i = 0; i < inputNumbers.length; i++) {
			long product = 1;
			//Loop through inputNumbers array and generate product for productArray
			for(int j = 0; j < inputNumbers.length; j++) {
				if(j != i) {
					product *= inputNumbers[j];
				}
			}
			productArray[i] = product;
		}
		
	    System.out.println("\nProduct Array is: " + Arrays.toString(productArray));
	}

}
