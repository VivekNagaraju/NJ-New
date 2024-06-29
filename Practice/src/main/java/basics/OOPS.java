package basics;

public class OOPS {

	public static void main(String[] args) {
		// Syntax for creating an object: ClassName objectName = new ClassName();
		
		Car maruthi = new Car("Grey", 4, 4);
		/*
		 * maruthi.color="Grey"; maruthi.noOfWheels=4; maruthi.seats=4;
		 */
//		maruthi.start();
		
		System.out.println("Color of Maruthi Car "+maruthi.color);
//		System.out.println(maruthi.noOfWheels);
//		System.out.println(maruthi.seats);
		
		Car swift = new Car("White", 4, 5);
		System.out.println("Color of Swift Car "+swift.color);
		System.out.println("Color of Maruthi Car "+maruthi.color);

	}

}

class Car{
	String color;
	int noOfWheels;
	int seats;
	
	Car(String c, int w, int s){
//		System.out.println("Car class constructor has been called");
		this.color=c;
		this.noOfWheels=w;
		this.seats=s;
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
