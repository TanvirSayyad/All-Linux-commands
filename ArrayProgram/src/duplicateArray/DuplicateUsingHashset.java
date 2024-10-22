package duplicateArray;

import java.util.HashSet;

public class DuplicateUsingHashset {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 6, 7, 65, 4, 4, 3, 2 };

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < a.length; i++) {

			hs.add(a[i]);

		}

		for (Integer I : hs) {

			System.out.print(I + "  ");

		}

	}

}
