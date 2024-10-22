package mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();

		Map<Integer, String> mp = new HashMap<Integer, String>();


		mp.put(1, "Cisco1");
		mp.put(2, "Cisco2");

		System.out.println(mp.containsKey("Cisco1"));
		mp.remove(4, "cisco1"); // remove element

		System.out.println("ifAbset=" + mp.putIfAbsent(5, "Tanvir "));

		// if absent element then put

		System.out.println("get= " + mp.get(5));
		// get 4 key

		System.out.println(mp.getOrDefault("getdefault=" + 6, "cisco1"));

		System.out.println("replaced=" + mp.replace(4, "Sayyad"));
		System.out.println(mp.keySet() + "key Set=");
		System.out.println("valueSet" + mp.values());
		System.out.println(mp.entrySet());


	}


}
