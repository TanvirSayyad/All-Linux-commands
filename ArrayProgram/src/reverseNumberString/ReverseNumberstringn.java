package reverseNumberString;

public class ReverseNumberstringn {

	public static void main(String[] args) {
		int rev = 0;
		int num = 1234;
		while (num != 0) {

			int seperate = num % 10; // 4 remainder
			rev = rev * 10 + seperate; // 4

			num = num / 10; // 123

		}

		System.out.println("revrse number is " + rev);

	}

}
