package in.sp.beans;

public class Address {
	private int no;
	private String city;
	private int pin;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [no=" + no + ", city=" + city + ", pin=" + pin + "]";
	}

}
