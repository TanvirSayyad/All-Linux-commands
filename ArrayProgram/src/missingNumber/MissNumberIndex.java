package missingNumber;

public class MissNumberIndex {
	public static void main(String[] args) {
		int a[] = { 2, 4, 8, 10 };
		int sum = 0;
		int sum2 = 0;
		int count = 0;
		int countmiss = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			count++;
		}
		System.out.println("sum is " + sum);
		System.out.println(count);

		for (int i = 1; i <= 10; i++) {

			sum2 = sum2 + i;
			countmiss++;

		}

		System.out.println("the sum is " + sum2);
		System.out.println("sum1-sum2=" + (sum2 - sum));
	}
}
