package reverseNumberString;

public class Palidromestring {
	public static void main(String[] args) {
		String rev = "";
		String str = "mam";
		String original = str;
		char a[] = str.toCharArray();
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		if (rev.equals(original)) {

			System.out.println("palidrom");

		} else {
			System.out.println("not pali");
		}

	}

}
