package oops.p1;

public class BankRunner {
	public static void main(String[] args) {
		BankAccount BA = new BankAccount(56000.89);
		// display initial balance
		System.out.println("initial" + BA.GetBalance());

		BA.deposit(4500.0);
		System.out.println("deposite" + BA.GetBalance());

		BA.withdraw(500);
		System.out.println("withdrrwa" + BA.GetBalance());

	}

}
