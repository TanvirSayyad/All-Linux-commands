package auto.sp.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int Stid;
	private String name;
	@Autowired
	private Address address;

	public int getStid() {
		return Stid;
	}

	public void setStid(int stid) {
		Stid = stid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("ID :" + Stid + "" + "Name :" + name + " " + "address" + address);
	}

}
