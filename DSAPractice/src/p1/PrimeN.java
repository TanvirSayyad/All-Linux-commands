package p1;

import java.util.Scanner;

public class PrimeN {

//prime number means 1,2,3,5,7,

	public static void main(String[] args) {

		System.out.println("enter any number ");
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();

		if (n <= 1) {
			System.out.println("not prime");
		}

		int count = 0;


		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;

			}

		}

		if (count == 2) {
			System.out.println("its an prime number");

		} else {
			System.out.println("its not prime");
		}
	}
	
}
