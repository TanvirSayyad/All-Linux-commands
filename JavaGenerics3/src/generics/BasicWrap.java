package generics;

import java.util.ArrayList;

public class BasicWrap {
	public static void main(String[] args) {

		int a = 10; //
		Integer a1 = a; // Autoboxing int to Integer
		int b = a1; // unboxing Integer to initial state

		// working with collection
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.add(22));

		// utility method
		// conversion int primitive to wrapper objects
		String s = "100";

		int value = Integer.parseInt(s);

		System.out.println(value);
	}

}
