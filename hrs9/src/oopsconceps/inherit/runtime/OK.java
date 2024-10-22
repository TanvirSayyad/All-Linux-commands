package oopsconceps.inherit.runtime;


//method same parameter same return type must be same
//access modifier =>public protected default priavte
//final and sttaic method we cant overide
class hi{
	

void m1() {
	
System.out.println("h1 m1 class");

}
public void m2(int a) {
	System.out.println("m2 in hi");
	
}
static void m3() {
	System.out.println("m2 in hi");
	
}


}
class hello extends hi{
	void m1() {
		System.out.println("m1 in helloi");
	}
	public void m2(int a) {
		System.out.println("m2 in  helloi");
	}
	static void m3() {
		System.out.println("sttaic hello");
	}
}

public class OK {
public static void main(String[] args) {
	hi h1=new hello();
	h1.m1();    //taking output from subclas beacuse of subclass redrence
	
}

}
