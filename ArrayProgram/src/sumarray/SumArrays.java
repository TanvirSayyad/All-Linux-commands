package sumarray;

public class SumArrays {

	public static void main(String[] args) {
		int a[] = { 1, 5, 3 };
		int sum = 0;
		for (int value : a) {

			sum = value + sum;

		}
		System.out.println(sum);
	}

}
