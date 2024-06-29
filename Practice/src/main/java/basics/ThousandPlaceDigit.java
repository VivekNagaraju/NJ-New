package basics;
import java.util.Scanner;

public class ThousandPlaceDigit {

	public static void main(String[] args) {
		
		int n;
		while(true) {
			System.out.println("Enter a number");
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			System.out.println("entered number is="+n);
		
			if(n<1000) {
				System.out.println("Please enter number greater than 999");
			}else if(n>=10000) {
				n=((n%10000)-(n%1000))/1000;
				System.out.println("1000 place digit is="+n);
			}else {
				n=((n)-(n%1000))/1000;
				System.out.println("1000 place digit is="+n);
			}
			
			System.out.println("Do you want to continue?(Y/N)");
			String d=s.next();
		
			if (d.equalsIgnoreCase("N")) {
				break;
			}else {
				System.out.println("Please enter Y/N only");
				String e=s.next();
				if (e.equalsIgnoreCase("N")) {
					break;
				}
			}
		

	}
	}

}
