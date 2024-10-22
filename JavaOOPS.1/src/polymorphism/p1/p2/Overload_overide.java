package polymorphism.p1.p2;

class BankAccount {
	protected double balance;// store balnace // 50,000

	// initialize balnce in constructor
	public BankAccount(double balance) {
		this.balance = balance;

	}

	// overload deposite method for deposite cash ammount

	public void deposite(double cashAmmount) {
		balance += cashAmmount; // add cash to balnace //1000
		System.out.println("deposite cash" + cashAmmount + "total balance" + balance);

	}
	// overload deposite method for bank transfer

	public void deposite(String AcNumber, double Ammount) {
		balance += Ammount; // add Ammount
		System.out.println("deposite via trasfer the account" + AcNumber + "Ammount:" + Ammount + "balance" + balance);

	}
	// method to withdraw money using overiding
	// Different accounts like SavingsAccount and CurrentAccount will have different
	// rules for withdrawing
	// money, so we'll override the withdraw method.

	public void withdraw(double Ammount) {
		System.out.println("withdrw method in base class");

	}

}

class SavingAccount extends BankAccount {

	public SavingAccount(double balance) {
		super(balance); // initialize balance for saving Account

	}

	@Override
	public void withdraw(double Ammount) {
		if (Ammount <= balance) {
			balance -= Ammount; // deduct account //40000
			System.out.println("withdraw" + Ammount + " from saving account" + balance + "balance after deduct");

		} else {
			System.out.println("insufficient balnace");
		}

	}
}

class CurrentAccount extends BankAccount {
	public CurrentAccount(double balance) {
		super(balance); // super keyword used for superclass method

	}

	@Override
	public void withdraw(double Ammount) {
		if (Ammount <= balance) {
			balance -= Ammount; // deduct ammount
			System.out.println("withdrw" + Ammount + "from current");

		} else {
			System.out.println("insufficient balance");
		}

	}
}
public class Overload_overide {
	public static void main(String[] args) {
		BankAccount SA = new SavingAccount(50000);
		SA.deposite(1000); // cash deposite

		SA.deposite("122345", 1000.1); // transfer deposite
		SA.withdraw(40000);

		BankAccount CA = new CurrentAccount(20000);
		CA.deposite(4000);
		CA.deposite("12345", 2300);
		CA.withdraw(2300);

	}

}

