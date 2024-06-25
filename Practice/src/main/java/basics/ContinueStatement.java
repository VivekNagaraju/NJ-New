package basics;

public class ContinueStatement {

	public static void main(String[] args) {
		
		/*for(int i=0; i<=100; i++) {
			if(i%2==0) {
				continue;
			}else {
				System.out.println(i);
			}*/
		
		int i=0;
		while (true) {
			if(i%2==0) {
				i++;
				continue;
			}else {
				System.out.println(i);
				i++;
			}
			
			if(i==100) {
				break;
			}
	
		}



	}

}
