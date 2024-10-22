package collectionJava4;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {

		int a[] = new int[10];

		List<Integer> list = new ArrayList<>();


		System.out.println(list);

		list.add(30);

		System.out.println("elements contains or not" + list.contains(10));

		if (list.isEmpty()) {
			System.out.println("Anything");

		} else if (!list.isEmpty()) {
			list.add(45);
			System.out.println("no issue");
		}

		list.isEmpty();

		int b = list.size();

		for (int i = 0; i < b; i++) {
			System.out.println(list.get(i));
		}

	}
}
