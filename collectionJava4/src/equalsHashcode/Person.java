package equalsHashcode;

import java.util.Objects;

class Person1 {
	private String name;
	private int age;

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person1 other = (Person1) obj;
		return age == other.age;
	}

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
public class Person {

	public static void main(String[] args) {

		Person1 p1 = new Person1("Tanvir", 1);
		Person1 p2 = new Person1("Tanvir ", 2);
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);


	}

}
