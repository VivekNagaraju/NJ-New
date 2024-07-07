package accessModifiers;

public class ProtectedModifiers {
	protected int age = 18;
	int height; // default variable
	
	protected void proM4() {
		System.out.println("This is protected method in public class");
	}
	
	public void proM5() {
		System.out.println("This is public method");
	}
	
	void dM1() { // default method
		System.out.println("This is default method");
	}
	

	public static void main(String[] args) {
		ProModifiers proObj = new ProModifiers();
		proObj.proM1();
		System.out.println(proObj.name);

	}

}

class ProModifiers{
	protected String name="Vivek";
	protected void proM1() {
		System.out.println("This is a protected method");
		
	}
	public void proM2() {
		proM1();
		System.out.println(name);
	}
}

class ProMChild extends ProModifiers{
	public void proM3() {
		proM1();
		System.out.println(name);
		
	}
}