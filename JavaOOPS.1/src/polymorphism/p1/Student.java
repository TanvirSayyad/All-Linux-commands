package polymorphism.p1;

//compile time poly
public class Student extends Main {

	public void read() {
		System.out.println("read xyz book");

	}

	public void read(String book) {
		System.out.println(" bookname" + book);

	}
}