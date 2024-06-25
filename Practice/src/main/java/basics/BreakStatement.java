package basics;

public class BreakStatement {

	public static void main(String[] args) {
		int stopRange = 45;
		/*for(int i=0; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
			if(i==stopRange) {
				break; // it stops the execution and brings the control out of loop once for all
			}*/
		
		int i=0;
		while (true) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
			if(i==stopRange) {
				break;
			}
			
			
		}

	}

}
