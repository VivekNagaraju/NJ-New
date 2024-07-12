package oops;
import java.io.*;

import java.util.InputMismatchException;

public class ThrowAndThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void m1() throws ArithmeticException, InputMismatchException {
		throw new ArithmeticException();
	}
	
	void m2() {
		try {
			m1();
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
	}

}
