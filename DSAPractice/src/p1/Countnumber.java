package p1;

public class Countnumber {

	public static void main(String[] args) {
		int num = 3;
//		5*4*3*2*1
		int fact = 1;

		for (int i = num; i >= 1; i--) {

			fact = fact * i;

		}
		System.out.println("factorial  " + fact);

	}

}
