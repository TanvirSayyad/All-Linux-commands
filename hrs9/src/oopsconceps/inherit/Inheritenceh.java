package oopsconceps.inherit;
//when we do class as final we cant extend it it throwing error
class A{
	int a=10;
 static int b=20;
	
	
	//super class 
	A(){
		System.out.println("constructor");
		
	}
	static {
		System.out.println("static method");
	}
	{
		System.out.println("instance methoid");
	}
	void m1() {
		System.out.println("m1 in A");
	}

}
class B extends A{
	
void showAll() {
	
	//all member is acceses their but block is not inherited
	System.out.println(a);
	System.out.println(b);
}
	
}

public class Inheritenceh {
	public static void main(String[] args) {
		B b1=new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.m1();
		
	}

}
