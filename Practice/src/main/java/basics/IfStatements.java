package basics;

public class IfStatements {

	public static void main(String[] args) {
		
		int age=5;
		if (age>18) {
			if (age>59) {
				System.out.println("You're a senior citizen");				
			}else {
				System.out.println("You're an adult");
			}
			
		}else if (age>12) {
			System.out.println("You're a teenager");
		}else {
			System.out.println("You're a child");
		}



	}

}
