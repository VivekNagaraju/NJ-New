/*
 * Operators: Symbols which perform operations on Operand/s (Input values given to that operation).
 * 
 * Ex:
 * 
 * Operation: Addition
 * Operator: +
 * 
 *  Types/ classification of Operators:
 *  1. Assignment operator: =, +=, -=, *=, /=, %=  ; i/o: numeric
 *  2. Comparison/ relational operators: ==, !=, >, <, >=, <=; i/p: numeric, o/p: boolean
 *  3. Logical Operators
 *  4. Bitwise Operators
 *  5. Arithmetic Operators:+, -, *, /, %, ++, -- ; i/o: numeric
 *  
 *  Classification 2:
 *  1. Unary Operators: ++, --
 *  2. Binary Operators: +, -, ...
 *  3. Ternary Operators: 
 * 
 * */

package basics;

public class Operators {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		/*
		 * int c = a + b; // addition System.out.println("Sum of a and b is:" + c); //
		 * Concatenation System.out.println("Sum of " + a + " and " + b + " is:" + c);
		 * System.out.printf("Sum of %d and %d is %d", a, b, c); // formatting and
		 * parameterization of output string System.out.println(a+b);
		 * System.out.println(a^b);
		 */

		/* Increment(++)/ Decrement(--) Operators */
		/*
		 * System.out.println("Value of a before increment:" + a); int e=a++; // Post
		 * Increment- first value will be assigned and then incremented
		 * System.out.println("Value of e:"+e);
		 * System.out.println("Value of a after increment:" + a);
		 * System.out.println("=============================");
		 * System.out.println("Value of b before increment:" + b); int f=++b; // Pre
		 * Increment- first increments and value will be assigned later
		 * System.out.println("Value of f:"+f);
		 * System.out.println("Value of b after increment:" + b);
		 */
		
		/* Assignment Operators */
		int x=5;
//		int y = x+=5; // x=x+5
//		System.out.println(y);
//		System.out.println(x);
		
		int z=x*=2;
		System.out.println(z);
		System.out.println(x);
		
		
		
		
		
	}

}
