package oops.p1;

public class Medical {

	public static void main(String[] args) {
		Capsule watch = new Capsule(111, 3, 9);
		
	watch.GetHrs();
	watch.GetMin();
	watch.Getsec();
	System.out.println("initial time");
	
	watch.Show();

	}
}
