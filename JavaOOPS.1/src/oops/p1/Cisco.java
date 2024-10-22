package oops.p1;

public class Cisco {
//overidden method
	public void eat() {
		System.out.println("i am eating");
	}
}
class Tanvir extends Cisco {
	
	// method overidding 

	@Override
	public void eat() {
		System.out.println("i am child");
	}

}
//arguments same 
//return type same
//modifer only high(public)
//public >protected>default>private
