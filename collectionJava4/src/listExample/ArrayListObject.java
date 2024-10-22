package listExample;

import java.util.ArrayList;

class Student {
	String name;
	int id;
	int age;

	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "name=" + name + "Age=" + age + "ID=" + id;

	}

}

public class ArrayListObject {

	public static void main(String[] args) {

		ArrayList<Student> Al = new ArrayList<Student>();

		Al.add(new Student("Tanvir", 24, 1));
		Al.add(new Student("Aron", 23, 5));

		for (Student student : Al) {
			System.out.println(student);
		}


	}

}
