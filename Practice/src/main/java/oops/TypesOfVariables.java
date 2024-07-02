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
 	
 4. Final Variables 
 */
package oops;

public class TypesOfVariables {

	public static void main(String[] args) {
		Student abc = new Student();
		abc.displayTotalMarks(56, 0, 0);
		abc.displayKannadaMarks();
		abc.displaySchoolName();
		System.out.println(Student.schoolName);

	}
	
}
	
	class Student{
		int name;
		int id;
		int kannada;
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
	}


