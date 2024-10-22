package generics;

class Cat<A> {
	// generic class
	A id;

	public Cat(A id) {
		this.id = id;
}
}
class Dog {
	// without generic
	String id;

	public Dog(String id) {
		this.id = id;
}
}
public class Genericsclass {

public static void main(String[] args) {
	Dog d1 = new Dog("2112");
		Dog d2 = new Dog("d2");
		System.out.println(d1.id);

		Cat<Integer> ct = new Cat("xyz");
		System.out.println(ct.id);
		Cat ct1 = new Cat(23);



		// scenrio->if i want to put another data type inside d1 that time you
		// use generics in generics no need to declare data types

		// eg

	}

}
