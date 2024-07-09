/**
 1. Default= any class within same package
 2. Public = any class from any package
 3. Private = within same class
 4. Protected= any class within same package, sub classes in another packages
 */

package oops;

public class Encapsulation {

	public static void main(String[] args) {
//		Banking sbi = new Banking();
//		sbi.deposit(1000);
//		sbi.deposit(1000);
//		publicMethod();
//		System.out.println(Banking.name);
//		System.out.println(sbi.id);
//		System.out.println(Encapsulation.publicMethod());
		
		ATM atmUser = new ATM();
		atmUser.insertCard();
		atmUser.enterPIN();
		atmUser.accountType();
		atmUser.enterAmount();
		atmUser.collectCash();

	}
	
	public static int  publicMethod() {
		System.out.println("This is public method");
		return 2;
		
	}

}





abstract class Banking{
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
	
	public abstract void displayInterestRate();
	
	
}

class ATM {
	// public - insert card, enter pin, account type, enter amount, cash withdraw
	
	
	public void insertCard() {
		System.out.println("card is inserted");
		cardValidation();
	}
	
	public void enterPIN() {
		System.out.println("PIN entered successfully");
		pINValidation();
	}
	
	public void accountType() {
		System.out.println("Entered account type");
		accountSelection();
	}
	
	public void enterAmount() {
		System.out.println(" Amount Entered");
		balanceAvailability();
		dispenseCash();
		balanceUpdate();
	}
	
	public void collectCash() {
		System.out.println("Cash collected");
	}
	
	// private - card validation, pin validation, account selection, amount validation, balance update
	
	private void cardValidation() {
		System.out.println("Card validated successfully");
	}
	
	private void pINValidation() {
		System.out.println("PIN validated successfully");
	}
	
	private void accountSelection() {
		System.out.println("Account type selected");
	}
	
	private void balanceAvailability() {
		System.out.println("Balance is available");
	}
	
	private void dispenseCash() {
		System.out.println("Cash dispensed");
	}
	
	private void balanceUpdate() {
		System.out.println("Balance updated");
	}
}
	



