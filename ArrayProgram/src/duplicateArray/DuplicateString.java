package duplicateArray;

public class DuplicateString {


	public static void main(String[] args) {

		String str = "Tanviri";
		char[] a = str.toCharArray();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {

					System.out.println("duplicate " + a[i]);
					System.out.println("this is index 1 =" + i); // 4
					System.out.println(" This is index of 2=" + j);// 6

				}

			}

		}
	}
}
