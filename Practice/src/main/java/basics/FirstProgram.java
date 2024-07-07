package basics;
import accessModifiers.*;

public class FirstProgram {

	public static void main(String[] args) {
		System.out.println("Hello");
//		ProModifiers proObj3 = new ProModifiers(); // default class, not visible outside the package
		ProtectedModifiers objNew= new ProtectedModifiers(); // Public class, visible outside the package
		objNew.proM5();
//		System.out.println(objNew.age); // not visible
//		objNew.proM4();// not visible
		
		

	}

}

class ProMChildTwo extends ProtectedModifiers{
	public void proM6() {
		System.out.println(age);
		proM4();
//		System.out.println(height);
//		dM1();
	}
}




