/**
 Abstraction: something which is in idea but not yet implemented
 
 - Case 1: when implementation of a functionality differs from one child class to another then we go for abstraction
 - In abstraction we define a method in parent class and leave its implementation to child classes
 - Terms: concrete method- implemented method, abstract method- unimplemented
 - If a class contains abstract method we can't  create object from that class (instantiate it)
 - It is mandatory for a child class to implement the abstract method or else it should declare as abstract too
 - Case 2: When users are not allowed create objects from parent class then we declare parent class as abstract class
 
 */
package oops;

public class Abstraction {

	public static void main(String[] args) {
//		Banking sbi = new Banking();
		SBI sbiObj = new SBI();
		sbiObj.displayInterestRate();
		
		Sedan hondaCity = new Sedan();
		hondaCity.sunRoof();
		

	}

}

class SBI extends Banking{

	@Override
	public void displayInterestRate() {
		System.out.println("Interest rate is 7.5%");
		
	}
	
}

class Sedan extends Car{

	Sedan(String c, int w, int s) {
		super(c, w, s);
	}
	Sedan(){
		
	}
	
	public void sunRoof() {
		System.out.println("Sun roof implemented");
	}
	
}


