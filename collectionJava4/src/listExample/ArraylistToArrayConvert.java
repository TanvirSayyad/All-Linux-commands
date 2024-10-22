package listExample;

import java.util.ArrayList;

public class ArraylistToArrayConvert {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("Aa");
		str.add("Da");
		str.add("ca");
		str.add("Ba");

		System.out.println("ArrayList is=" + str);
		String[] a = new String[str.size()];
		str.toArray(a);

		for (String b : a) {
			System.out.println(b);

		}

	}

}
