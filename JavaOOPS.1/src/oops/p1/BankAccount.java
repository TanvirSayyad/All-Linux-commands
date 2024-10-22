package oops.p1;

public class BankAccount {
	private double bankBalance;

	public BankAccount(double initialbankBalance) {

		// TODO Auto-generated constructor stub
		this.bankBalance = initialbankBalance;

	}

	// getter method for balnce
	public double GetBalance() {
		return bankBalance;

	}

	// set for balance
	public void setBalance() {
		this.bankBalance = bankBalance;

	}

	// method to deposit money
	public void deposit(double depositbalance) {
		double total = bankBalance + depositbalance;
		System.out.println("total balnce" + total);

	}

	// method for withdrawl
	public void withdraw(double withdrwbalance) {
		double finalAmount = withdrwbalance - bankBalance;
		System.out.println("withdrw balance" + finalAmount);

	}



}
