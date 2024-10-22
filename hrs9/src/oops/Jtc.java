package oops;

class Hello{
	int a=20;  //instance variable
	static int b=20;// static variable
	{
		
		System.out.println("instance block");
	}
	Hello(int x){
		System.out.println("i am constructor"+x);
		x=x+x;
		
		
	}
static {
	
	//in Static we only static member we can 
	System.out.println("static block in hello");
	System.out.println(b);
	
}
void m1() {
	System.out.println("instance method");
}
static void m2() {
	System.out.println("m2 static");
}
}

public class Jtc {
	public static void main(String[] args) {
		
		System.out.println(Hello.b);
		Hello hl=new Hello(2);
		
		
		
	}

}
