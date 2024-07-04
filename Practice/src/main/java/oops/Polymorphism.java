/**
 Polymorphism: if any entity takes multiple forms
 
 Poly= Many
 Morph= forms
 
 Example: + --> operator overloading
 
 Types of polymorphism:
 1. Compile time polymorphism/ static polymorphism/ method overloading: methods with same name but different variables and implementation
 2. Runtime polymorphism/ non- static polymorphism/ method over-riding: methods with same name and variables defined in parent and child classes
  if a method is present in child class it will over ride the method in parent class with the same name
 
 */
package oops;

public class Polymorphism {

	public static void main(String[] args) {
		Maths calculator= new Maths();
		calculator.sum(4, 7, 0);
		calculator.sum(4.8, 5, 3);

	}
	
	

}
class Maths {
	public void sum(int a, int b, int c) {
		int total= a+b+c;
		System.out.printf("Sum of %d, %d, %d is %d", a, b, c, total);
		System.out.println();
		
	}
	
	public void sum(double a, int b, int c) {
		double total= a+b+c;
		System.out.printf("Sum of %f, %d, %d is %f", a, b, c, total);
		System.out.println();
	}
}
