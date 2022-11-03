package NewPackage;

/*
This problem was asked by Jane Street.
cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. 
For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
Given this implementation of cons:
def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
    
Implement car and cdr.

Originally asked in Python, translating to Java for this example

Author: Conor Evans
 */
public class Main {

	public static void main(String[] args) {
		cons pair = new cons(3, 4);
		
		System.out.print("Result of car is : " + pair.car() + "\n");
		System.out.print("Result of cdr is : " + pair.cdr());
		
	}
}
