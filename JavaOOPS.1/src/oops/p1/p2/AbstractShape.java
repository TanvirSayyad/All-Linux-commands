package oops.p1.p2;

public class AbstractShape {
	public static void main(String[] args) {
		Circle circle = new Circle(2);

		Rectangle rectangle = new Rectangle(2.3, 1);
		Cyl cl = new Cyl(3.00);
		System.out.println("cylinder area" + cl.CalculateArea());

		System.out.println("Area of circle" + circle.CalculateArea());
		System.out.println("area of rectangle" + rectangle.CalculateArea());
	}

}
