package oops.p1;

public class Capsule {
	private int hrs;
	private int min;
	private int sec;

	public Capsule(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;

	}

	public int GetHrs() {
		return hrs;

	}

	public void setHrs() {
		this.hrs = hrs;

	}

	public int GetMin() {
		return min;
	}

	public int Getsec() {
		return sec;
	}

	public void setMin() {
		this.min = min;
	}

	public void SetSec() {
		this.sec = sec;
	}

	public void Show() {
		System.out.println("display min hr sec " + min + "" + sec + "" + hrs);
		if (hrs <= 10) {
			System.out.println("GOOD Night");

		} else {
			System.out.println("GM");
		}
	}

}
