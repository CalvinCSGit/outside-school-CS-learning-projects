package The_MyCircle_and_MyPoint_Classes;

public class TestMyCircle {
	public static void main(String args[]) {
		
		MyCircle c1 = new MyCircle();
		System.out.println(c1);
		MyPoint p1 = new MyPoint(2, 4);
		c1.setCenter(p1);
		System.out.println(c1);
		c1.setCenterX(4);
		c1.setCenterY(8);
		System.out.println(c1);
		c1.setCenterXY(10, 12);
		System.out.println(c1);
		c1.setRadius(2);
		System.out.println(c1);
		
		
		
		MyCircle c2 = new MyCircle(2, 4, 8);
		System.out.println("\n\n" + c2);
		System.out.printf("the radius of circle 2 is : %d\n", c2.getRadius());
		System.out.printf("The area of circle 2 is : %.2f", c2.getArea());
		System.out.println("\nThe circumference of circle 2 is : " + c2.getCircumference());
		
		MyPoint p2 = new MyPoint();
		MyCircle c3 = new MyCircle(p2, 24);
		System.out.println("\n\n" + c3);
		System.out.println("The distance between circle 3 and circle 2 is : " + c3.distance(c2));
		
	}

}
