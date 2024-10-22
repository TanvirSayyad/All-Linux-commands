package auto.sp.bean;

public class Address {
	private String City;
	private int pin;

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [City=" + City + ", pin=" + pin + "]";
	}

}
