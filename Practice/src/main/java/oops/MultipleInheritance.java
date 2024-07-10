package oops;

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj1 = new A(); // not allowed
		C obj2 = new C();

	}

}

interface A{
	// unimplemented methods
	void eat();
	
	 //Implemented method in Interface
	default void drink() {
		
	}
}

interface B{
	// unimplemented methods
	void dance();
}

class C implements A, B{
	// implemented methods will override unimplemented methods

	public void dance() {
		// TODO Auto-generated method stub
		
	}

	public void eat() {
		// TODO Auto-generated method stub
		
	}
	

	
}