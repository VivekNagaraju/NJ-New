/**
 Types of variables:
 
 1. Local Variables
 	- Declaration: Variables defined inside a method. 
 	- Scope: This is limited to that particular method
 	- Lifetime: Exist only during the execution of the method
 	
 2. Static Variables/ Class Variables: 
 	- Declaration: declare it with 'static' keyword inside class but outside of any methods
 	- We can access it using  class name
 	- Scope: Entire class
 	- Lifetime: as long as class exists
 	
 
 3. Non- static variables/ Instance variables:
 	- Scope: Variables which can be accessed using objects. Each object has its own instance variables
 	- Declaration:We declare this variables outside of any methods/ constructor but inside class
 	- If we have to declare these variables inside any method we should use 'this' keyword
 	- Lifetime: Exist as long as the object exists
 	
 4. Final Variables:
 	- Once assigned, the value will not change
 	- we use final variable to declare constants
 */
package oops;

public class TypesOfVariables {

	public static void main(String[] args) {
		Student abc = new Student();
		abc.displayTotalMarks(56, 0, 0);
		abc.displayKannadaMarks();
		abc.displaySchoolName();
		System.out.println(Student.schoolName);
		abc.calculateAreaOfCircle(4);
//		abc.pi=287; // final variable can not be re-initialized
		abc.calculateAreaOfCircle(4);

	}
	
}
	
	class Student{
		int name;
		int id;
		int kannada;
		final double pi=3.142;
		static String schoolName="iQuest";
		public void displayTotalMarks(int kannada, int english, int maths ) {
			this.kannada=kannada;
			int total=kannada+english+maths; // Local Variables
			System.out.println(total);
		}
		
		public void displayKannadaMarks() {
			System.out.println(this.kannada);
		}
		
		public void displaySchoolName()
		{
			System.out.println(schoolName);
		}
		
		public void calculateAreaOfCircle(int r) {
			
			double area=pi*r*r;
			System.out.printf("Area of circle is %f", area);
			System.out.println();
		}
	}


