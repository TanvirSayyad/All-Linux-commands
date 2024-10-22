package equalsHashcode;

public class Equalsm {
	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";

		System.out.println(s1 == s2);// false
		System.out.println(s1 == s3); // diffrent memory
		// comapare memory address of two object and return true
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));// true
		// checks contents/value

	}
	// Output false false true true

}
