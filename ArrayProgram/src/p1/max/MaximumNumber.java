package p1.max;

public class MaximumNumber {
	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 5, 6, 8, 9, 67 };
		int min = a[0];
		int minindex = 0;
		for (int i = 1; i < a.length; i++) {

			if (min > a[i]) {
				min = a[i];
				minindex = i;

			}

		}
		System.out.println("Min number ==" + min);

		System.out.println("Min==" + minindex);

	}

}// Min number ==1
	// Min==0
