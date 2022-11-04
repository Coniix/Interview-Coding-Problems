package NewPackage;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

/*
This problem was asked by Facebook.
Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
For example, the message '111' would give 3, since a = 1 and k = 11 it could be decoded as 'aaa', 'ka', and 'ak'.
You can assume that the messages are decodable. For example, '001' is not allowed.


Author: Conor Evans
 */
public class Main {
	
	public static Set<String> decode(String prefix, String code) {
		Set<String> set = new HashSet<>();
		
		System.out.println("Prefix is: " + prefix);
		System.out.println("Code is: " + code);


		if(code.length() == 0) {
			set.add(prefix);
			
			return set;
		}
		

		set.addAll(decode(prefix + (char) (code.charAt(0) - '1' + 'a'),	code.substring(1)));

		//If number at code index 0 is 1 or 2 meaning 10's or 20's 
		if (code.length() >= 2 && code.charAt(0) == '1')
		{
			set.addAll(decode(prefix + (char) (10 + code.charAt(1) - '1' + 'a'), code.substring(2)));
		}
		if (code.length() >= 2 && code.charAt(0) == '2'	&& code.charAt(1) <= '6') //Char at index 1 must be <= 6 to be 20's
		{
			set.addAll(decode(prefix + (char) (20 + code.charAt(1) - '1' + 'a'), code.substring(2)));
		}
		
		return set;
	}
	
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("What is your encoded message?\n");

	    String inputMessage = userInput.next();  // Read array size from user
	    
	    userInput.close();
			    
	    System.out.print("\nDecoded message is: " + String.join(", ", decode("", inputMessage)));	}
}
