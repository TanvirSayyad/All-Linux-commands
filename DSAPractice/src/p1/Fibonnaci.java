package p1;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {

		// 0,1,1,2,3,5

		int a = 0;
		int b = 1;
		System.out.println("no");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);

		}
	}

}
