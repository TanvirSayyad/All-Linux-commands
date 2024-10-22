package uncheckedExce;

public class TryCatchBl {
	public static void main(String[] args) {




		System.out.println(
				"1.we can handled exception using proper class name exceptions like arrayoutof bound,arithmatic ");

		System.out.println("2.those all exceptions parent class is Exception so we can directly use Exception e ");



		try {
			int a[] = new int[5];
			String s = null;
			String[] arr = new String[5];

			int res = 5 / 0;// Arithmatic Exception

			System.out.println("array:" + a[8]); // Array outOfBoundException

			System.out.println(s.length()); // NULLPointerException
			System.out.println(arr[10]); // NULLPointerException

		} catch (Exception e) {

			System.out.println("Exception handled");
			// TODO: handle exception
		}


//		try {
//			int result = 5 / 0;
//
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.getStackTrace());
//			System.out.println(e.getCause());
//			// TODO: handle exception
//		}
//
//		// Note- the code execute line by line so that why exception also check line by
//		// line
//
//		System.out.println("execute line by line");
////		System.out.println(a[6]); //getting exception ArrayIndexOutOfBound
//		try {
//			System.out.println(a[6]);
//			// int result=5/0;
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//
//			System.out.println("try to access out of bound element");
//			// TODO: handle exception
//		}
//
//		System.out.println("terminate at the end");
	}
}
