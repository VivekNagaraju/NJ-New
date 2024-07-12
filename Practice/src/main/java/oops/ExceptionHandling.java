/*
 1. Try-single catch: Try block can have single catch block with Exception as parameter. 
 This we call as default catch block. 
 We go for this option when all the exceptions thrown by a try block have common fix
 2. Try- multiple catch: If exceptions thrown by try block are handled differently.
 3. Finally block will be executed irrespective of exception thrown
 
 throw
 throws
 */

package oops;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =1+2;
		System.out.println(a);
		int b = 6-4;
		System.out.println(b);
		int c= 4*3;
		System.out.println(c);
		try {
			System.out.println("Enter a number");
			int n=sc.nextInt();
			int d=8/n;
			System.out.println(d);
		}catch(InputMismatchException ie){
			System.out.println("Please enter integers only");
		}catch(ArithmeticException ae) {
			System.out.println("Please enter an integer other than zero");
		} 
			  catch(Exception e){ System.out.println(e);
			  
			  }
			 finally {
			
			sc.close();
			System.out.println("Scanner is closed");
		}
		
		int e=19%2;
		System.out.println(e);

	}

}
