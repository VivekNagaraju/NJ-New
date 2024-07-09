package oops;

public class Interface {

	public static void main(String[] args) {
		Cube cubeObj = new Cube();
		cubeObj.side=4;
		cubeObj.calculateArea();
		cubeObj.calculateVolume();

	}

}

interface Shape{
	public void calculateArea();
	public void calculateVolume();
	
}

class Cube implements Shape{
	double side;

	public void calculateArea() {
		double area = 6*side*side;
		
	}

	public void calculateVolume() {
		double volume = side*side*side;
		
	}
}
