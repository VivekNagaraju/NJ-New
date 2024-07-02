package oops;

public class Inheritance {

	public static void main(String[] args) {
		
		System.out.println("=========Grand Father class=========");
		GrandFather ajja = new GrandFather();
		ajja.grandFatherProperty();
		
		System.out.println("===========Father class=============");
		Father appa = new Father();
		appa.fatherProperty();
		appa.grandFatherProperty();
		
		System.out.println("===========Child class=============");
		Child nanu = new Child();
		nanu.childProperty();
		nanu.fatherProperty();
		nanu.grandFatherProperty();

	}

}

class GrandFather{
	public void grandFatherProperty() {
		System.out.println("This is Grand Father's property");
	}

}

class Father extends GrandFather{ // Single-level inheritance
	public void fatherProperty() {
		System.out.println("This is Father's property");
	}
	
	
}



class Child extends Father{ //Multi-level inheritance
	
	public void childProperty() {
		
		System.out.println("This is child's property");
	}
}
