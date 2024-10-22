package s1.constructor.xmls;

public class Animal {
	private String name;
	private int age;
	private Dog dog;

	public Animal(String name, int age, Dog dog) {

		this.name = name;
		this.age = age;
		this.dog = dog;
	}

	public void Display() {
		System.out.println("name = " + name);
		System.out.println("age =" + age);
		System.out.println("dog =" + dog);
	}
}

