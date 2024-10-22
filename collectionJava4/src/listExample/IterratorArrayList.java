package listExample;

import java.util.ArrayList;
import java.util.Iterator;

public class IterratorArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> IT = new ArrayList<String>();
		IT.add("veer");
		IT.add("Tanvir");
		IT.add("hello");

		Iterator<String> iterator = IT.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}

}
