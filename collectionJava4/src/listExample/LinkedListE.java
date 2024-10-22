package listExample;

import java.util.ArrayList;
import java.util.Collections;

public class LinkedListE {

	public static void main(String[] args) {

		ArrayList<Integer> N = new ArrayList<Integer>();

		// Addding element
		N.add(10);
		N.add(30);
		N.add(3);
		N.add(0);
		int n = N.size();
		System.out.println("size of an array" + n);

		System.out.println("after sort");
		Collections.sort(N);
// accsing elements
		for (int i = 0; i < n; i++) {
			System.out.println(N.get(i));

			if (N.get(i) == 0) {
				System.out.println(N.remove(0));

				N.add(4);
				System.out.println("after new element add" + N);

			} else if (N.contains(0)) {

				N.clear();

			}
		}



	}

}
