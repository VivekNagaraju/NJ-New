/**
 1. Default= any class within same package
 2. Public = any class from any package
 3. Private = within same class
 4. Protected= any class within same package, sub classes in another packages
 */

package oops;

public class Encapsulation {

	public static void main(String[] args) {
		Banking sbi = new Banking();
		sbi.deposit(1000);
		sbi.deposit(1000);
		publicMethod();
		System.out.println(Banking.name);
		System.out.println(sbi.id);
		System.out.println(Encapsulation.publicMethod());
		

	}
	
	public static int  publicMethod() {
		System.out.println("This is public method");
		return 2;
		
	}

}





class Banking{
	// amount, balance
	//deposit, withdraw, balance-check
	private int balance;
	public static String name="abc";
	protected int id=3;
 	public void deposit(int amount) {
		if (amount>0) {
			balance=balance+amount;
			getBalance();
		}else {
			System.out.println("Enter valid number");
		}
		
	}
	
	public void getBalance() {
		System.out.println("Your balance is "+ balance);
		
	}
	
	public void getId() {
		System.out.println(id);
	}
	
}

class ATM extends Banking{
	
	
	public void getId() {
		System.out.println(id);
	}
}



