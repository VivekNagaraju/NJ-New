package oops;

public class OOPS {

	public static void main(String[] args) {
		// Syntax for creating an object: ClassName objectName = new ClassName();
		
//		Car maruthi = new Car("White", 4, 4);
//		System.out.println("Color of Maruthi Car "+maruthi.color);
//		maruthi.start();
//		
//		Car swift = new Car("Red", 6, 5);
//		System.out.println("Color of Swift Car "+swift.color);
		
//		Banking hdfc=new Banking();
//		hdfc.deposit(25);
//		System.out.println(Banking.name);
//		System.out.println(Encapsulation.publicMethod());
//		System.out.println(hdfc.id);

	}

}
abstract class Car{
	String color;
	int noOfWheels;
	int seats;
	
	
	  Car(String c, int w, int s){ 
	  this.color=c;
	  this.noOfWheels=w; 
	  this.seats=s; 
	  }
	  Car(){
		  
	  }
	 
	
	public void start() {
		System.out.println("The car has started");
	}
	
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void moveForward() {
		System.out.println("Car is moving forward");
	}
	
	public void moveBackward() {
		System.out.println("Car is moving backward");
	}
}
