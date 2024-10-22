package p1;

import java.util.Scanner;

public class ArmoStrong {

	// 153 (1*1*1)+(5*5*5)+
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enetr any number");
		int n = sc.nextInt();

		int arm = 0;
		int c = n;
		sc.close();
		while (n > 0) {

			int rem = n % 10;

			arm = (rem * rem * rem) + arm;
			n = n / 10;

		}
		if (c == arm) {
			System.out.println("armo");
		} else {
			System.out.println("not");
		}
}

}
