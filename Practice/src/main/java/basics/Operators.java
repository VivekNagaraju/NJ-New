/*
 * Operators: Symbols which perform operations on Operand/s (Input values/ variables given to that operation).
 * 
 * Ex:
 * 
 * Operation: Addition
 * Operator: +
 * 
 *  Types/ classification of Operators:
 *  1. Assignment operator: =, +=, -=, *=, /=, %=  ; i/o: numeric
 *  2. Comparison/ relational operators: ==, !=, >, <, >=, <=; i/p: numeric, o/p: boolean
 *  3. Logical Operators: AND --> &&; OR --> ||, NOT --> !; i/p: boolean (TRUE/ FALSE), o/p: boolean
 *  
 *  AND Logic: When both the i/ps are TRUE o/p will be TRUE
 *  |  a  |  b  |  o/p  |
 *  |TRUE |TRUE |TRUE   |
 *  |TRUE |FALSE|FALSE  |
 *  |FALSE|TRUE |FALSE  |
 *  |FALSE|FALSE|FALSE  |
 *  
 *  OR Logic: When both the i/ps are TRUE o/p will be TRUE
 *  |  a  |  b  |  o/p  |
 *  |TRUE |TRUE |TRUE   |
 *  |TRUE |FALSE|TRUE   |
 *  |FALSE|TRUE |TRUE   |
 *  |FALSE|FALSE|FALSE  |
 *  
 *  NOT Logic: Reverse the i/p; it requires only one i/p
 *  |  a  | o/p |
 *  |TRUE |FALSE|
 *  |FALSE|TRUE |
 *  
 *  
 *  4. Bitwise Operators: 
 *  	Bitwise AND, & :
 *  	Bitwise OR , | :
 *  	Bitwise XOR, ^ :
 *  	Bitwise NOT, ~ :
 *  
 *  5. Arithmetic Operators:+, -, *, /, %, ++, -- ; i/o: numeric
 *  6. Shift Operator: 
 *  	Right shift: >>
 *  	Left shift: <<
 *  
 *  Classification 2:
 *  1. Unary Operators: ++, --, =
 *  2. Binary Operators: +, -,  AND --> &&; OR --> ||
 *  3. Ternary Operators: 
 *  	(condition) ? if true o/p : if false o/p
 * 
 * */

package basics;

public class Operators {

	public static void main(String[] args) {
		/*
		 * int a = 2; int b = 4;
		 */
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
//		int x=5;
//		int y = x+=5; // x=x+5
//		System.out.println(y);
//		System.out.println(x);
		
		/*
		 * int z=x*=2; System.out.println(z); System.out.println(x);
		 */
		
		
		/* Comparison/ relational operators */
		/*
		 * System.out.println(2==3); System.out.println(4==4);
		 */
		
		/* Logical Operators */
		/* AND Operator */
		System.out.println("========AND Operator========");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		/* OR operator */
		System.out.println("========OR Operator========");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		/* NOT Operator */
		System.out.println("========NOT Operator========");
		System.out.println(!true);
		System.out.println(!false);
		
		/* Bitwise Operators */
		System.out.println("========Bitwise Operators========");
		System.out.println(5 & 6);
		System.out.println(5 | 6);
		System.out.println(5 ^ 6);
		System.out.println(~5);
		
		/* Shift Operators */
		System.out.println("========Shift Operators=========");
		System.out.println(5<<6);
		
		/* Ternary Operators */
		System.out.println("=========Ternary Operators=======");
		int m = 14;
		int n = 7;
		System.out.println((m>n)?m:n);
	}

}
