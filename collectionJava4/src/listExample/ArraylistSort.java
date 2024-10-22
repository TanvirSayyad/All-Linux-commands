package listExample;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSort {
	// Sorting ArrayList

	public static void main(String[] args) {

		ArrayList<String> sortA = new ArrayList<String>();
		sortA.add("A");
		sortA.add("B");
		sortA.add("G");
		sortA.add("D");
		sortA.add("K");
		sortA.add("P");

		Collections.sort(sortA);
		System.out.println("sorted array Printed" + sortA);
		for (String st : sortA) {


			System.out.println(st);
		}

	}

}
