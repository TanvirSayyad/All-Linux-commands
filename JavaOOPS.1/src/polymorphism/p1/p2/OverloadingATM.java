package polymorphism.p1.p2;

class ATM {
	public void withdraw(int cardNumber, int pin) {
		System.out.println("withdrwa using card");
	}

	public void withdraw(String Upid) {
		System.out.println("withdraw using UPI");
	}

	public void withdraw(String name, String ifsccode, String account_number) {

		System.out.println("withdraw usnig bank");

	}
}
public class OverloadingATM {

	public static void main(String[] args) {

		ATM at = new ATM();
		at.withdraw(1234, 1234);
		at.withdraw("211292");
		at.withdraw("Tanvir", "kkbk2000k", "70122333");

		// TODO Auto-generated method stub

	}

}
