package setcollection;

import java.util.HashSet;
import java.util.Set;

class Student {
	int number;
	String name;

	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}


}
public class LearnSet {
	public static void main(String[] args) {

		Set<Student> hs = new HashSet();

		hs.add(new Student(1, "Tanvir"));
		hs.add(new Student(13, "Tanvieer"));
//		hs.add(20);
//		hs.add(50);
//		hs.add(60);
//		hs.add(20);
//		hs.add(30);

		System.out.println(hs);
//output [20, 30, 50, 60]  olog(n)



	}
	
}
