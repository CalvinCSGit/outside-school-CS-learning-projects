package The_Circle_Class;

public class TestCircle {
	public static void main(String args[]) {
		Circle c1 = new Circle();
		System.out.println(" The circle has a radius of " + c1.getRadius() + " and area of " + c1.getArea());
		Circle c2 = new Circle(2.0);
		System.out.println(" The circle has a radius of " + c2.getRadius() + " and area of " + c2.getArea());
		Circle c3 = new Circle(2.0, "purple");
		System.out.println(" The circle has a radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and color of " + c3.getColor());
		Circle c4 = new Circle();
		c4.setRadius(5.5);
		c4.setColor("green");
		System.out.println(" The circle has a radius of " + c4.getRadius() + " a area of " + c4.getArea() + " a color of " + c4.getColor());
		System.out.print(c4.toString());
	}
}
