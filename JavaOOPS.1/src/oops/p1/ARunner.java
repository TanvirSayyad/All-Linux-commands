package oops.p1;

public class ARunner {
	public static void main(String[] args) {
		// AbstractClass ab=new AbstractClass();
		AbstractClass ab = new Mychild();
		ab.cal();
		ab.launch();
	}
}
