package generics;

public class GenMethod {

	static <T> void PrintData(T s1) {
		System.out.println(s1);

	}
	public static void main(String[] args) {

		PrintData("Tanvir");

		// no need to make diffrent methods

	}

}
