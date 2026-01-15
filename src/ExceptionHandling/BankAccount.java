package ExceptionHandling;

import java.util.Scanner;

class Test {
	private double amount;
	double balance = 5000;

	public Test(double amount) {
		this.amount = amount;
	}

	public void withDraw() throws InsufficientFunds {
		if (amount > balance) {
			throw new InsufficientFunds();
		} else {
			System.out.println("Amount after Withdraw is: " + (balance - amount));
		}
	}
}

class InsufficientFunds extends Exception { // Creating the Custom Exception 
	private double amount;

	public InsufficientFunds() {
		super("What do you want ?");
		this.amount = amount;
	}

	
}

public class BankAccount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Amount to Withdraw: ");
		double w = s.nextInt();
		Test t = new Test(w);
		try {
			System.out.println("Total amount was ---> " + t.balance);
			t.withDraw();

		} catch (InsufficientFunds e) {
			System.out.println(e);
		}
	}

}
