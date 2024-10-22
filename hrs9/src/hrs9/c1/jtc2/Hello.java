package hrs9.c1.jtc2;



class Jtc{

	int a=10;
	
	static int b=20;
	
	static {
		System.out.println("sttaic bl;ock");
//		System.out.println(b);
	}
	{
		System.out.println("instance block");
	}
	void m1() {
		System.out.println("m1 in hello");
		System.out.println(b);
		
	}
	static void m2() {
		System.out.println("m2 hello");
		System.out.println(b);
	}
}
public class Hello {
public static void main(String[] args) throws Exception {
	
//	Jtc jc=null;
//	
//	System.out.println(jc.b);
	
	
	Class.forName("hrs9.c1.jtc2.Jtc");  //we can load the class using forname method
	Jtc js=new Jtc();
	js.m1();

}
	
	
}
