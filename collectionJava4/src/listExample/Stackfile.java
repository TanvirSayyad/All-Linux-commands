package listExample;

import java.util.Stack;

public class Stackfile {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Tanvir");
		st.push("Sayyad");
		st.push("Tanvir");
		st.push("Sad");
		st.push("Tr");
		st.push("Sd");
		st.push("vir");
		st.push("Says");

		System.out.println("pushed" + st);
		System.out.println(st.peek()); // last element peek firstly
		System.out.println(st.pop()); // last element remove
		System.out.println(st);
		System.out.println(!st.empty());

//		output 1.pushed[Tanvir, Sayyad, Tanvir, Sad, Tr, Sd, vir, Says]
//				2.Says
//				3.Says
//				4.[Tanvir, Sayyad, Tanvir, Sad, Tr, Sd, vir]
		// 5.true

	}

}
