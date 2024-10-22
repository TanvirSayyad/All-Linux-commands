package polymorphism.p1.p2;

class Vehicle {
	public void start() {
		System.out.println("Vehicle starting Using key");
	}
}

class Car extends Vehicle {
	// overidind start method
	@Override
	public void start() {
		System.out.println("start using Starter");

	}
}

class Bike extends Vehicle {
	@Override
	public void start() {
		System.out.println("start bike using kick");
	}
}
public class OveridingVehicle {
	public static void main(String[] args) {
		Vehicle myvehicle;
		myvehicle = new Car();
		myvehicle.start();

		myvehicle = new Bike();
		myvehicle.start();
	}

}
