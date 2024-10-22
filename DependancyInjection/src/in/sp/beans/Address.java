package in.sp.beans;

public class Address {
	private int pin;
	private String City;

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", City=" + City + "]";
	}

}
