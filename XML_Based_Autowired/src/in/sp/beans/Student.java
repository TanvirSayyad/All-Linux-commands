package in.sp.beans;

public class Student {
	private String Name;
	private Address address;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name :" + Name);
		System.out.println("Address :" + address);

	}
}
