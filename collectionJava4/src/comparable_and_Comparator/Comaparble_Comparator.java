package comparable_and_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comaparble_Comparator {
	public static void main(String[] args) {
		Animal a1 = new Animal(1, "leo", 30);
		Animal a2 = new Animal(2, "leo", 20);
		Animal a3 = new Animal(3, "leo", 10);
		Animal a4 = new Animal(4, "leo", 40);

		List<Animal> dogs = new ArrayList<>();
		dogs.add(a1);
		dogs.add(a2);
		dogs.add(a3);
		dogs.add(a4);
		System.out.println(dogs);

		Collections.sort(dogs);

	}

}
