package checkedExceptionExamples;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOExceptionExample {
	// IO Exception, File not found exception

	public static void main(String[] args) throws Exception {
		
		try {
			FileReader file = new FileReader("java.txt");
			BufferedReader br = new BufferedReader(file);
		} catch (Exception e) {
			// TODO: handle exceptions
			System.out.println("handled exception");

			throw new Exception("this is file not found exception");
		} finally {
			System.out.println("this is finallay block always executed");
		}


	}

}
