package in.sp.beans;

public class Address {
	private int no;
	private String city;

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

	@Override
	public String toString() {
		return "Address [no=" + no + ", city=" + city + "]";
	}

}
