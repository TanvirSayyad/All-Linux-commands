package listExample;

import java.util.ArrayList;

class OverPoly{
	int shape;
	String res;
	
	public OverPoly(int Shape, String res) {
		this.shape = shape;
		this.res = res;
		
	}

	@Override
	public String toString() {
		return shape + "this is shape" + "res" + res;
	}

}
public class ArrayListOverload {

	public static void main(String[] args) {
		ArrayList<OverPoly> over = new ArrayList<OverPoly>();
		over.add(new OverPoly(12, "right"));
		over.add(new OverPoly(20, "this"));

		for (OverPoly ov : over) {

			System.out.println(ov);

		}

	}

}
