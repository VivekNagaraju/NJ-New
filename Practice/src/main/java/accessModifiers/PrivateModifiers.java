package accessModifiers;

public class PrivateModifiers {

	public static void main(String[] args) {
		PModifiers obj = new PModifiers();
//		obj.id; // not visible
//		obj.m1(); // not visible
//		obj.m2();
		
		ProModifiers proObj2 = new ProModifiers();
		System.out.println(proObj2.name);
		proObj2.proM1();
		
		ProtectedModifiers dObj = new ProtectedModifiers();
		System.out.println(dObj.height);
		dObj.dM1();

	}

}

class PModifiers{
	private int id;
	private void m1() {
		System.out.println("This is a private method");
	}
	public void m2() {
		m1();
		System.out.println(id);
	}
}

class PMChildClass extends PModifiers{
	public void m3() {
		m2();
//		m1(); // not visible
//		System.out.println(id); // not visible
	}
}

class Dmodifier extends ProtectedModifiers{
	public void method(){
		System.out.println(height);
		dM1();
	}
}
