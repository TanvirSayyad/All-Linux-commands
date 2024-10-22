package oopsconceps.inherit.runtime.abstractc;

//class Animal{
//	void eating() {
//		System.out.println("Animal is eating");
//	}
////	void sleeping();   this is not allowd we need body compulsory
//	
//	
//	
//}
abstract class Car{
	void feature() {
		System.out.println("car features");
	}
	abstract void color();
	abstract void model();
	
}
abstract class bmwCar extends Car{
	//when we inherits the property from superclass abstract we should composory to overide
	public void color() {
		System.out.println("red");
	}
	
	
	 
}
abstract class bmwlatest extends bmwCar{
	
	public void color() {
		System.out.println("red");
	}
	
}
public class Jtc {
	public static void main(String[] args) {
		Car cr=null;
		
		
	}

}
