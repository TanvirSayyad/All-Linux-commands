package in.sp.beans;

public class Student {

	public void setName(String name) {
		Name = name;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private String Name;
	private int roll;
	private Address address;

	public void dispay() {
		System.out.println("Name :" + Name);
		System.out.println("roll no :" + roll);
		System.out.println("Address :" + address);
	}
}
