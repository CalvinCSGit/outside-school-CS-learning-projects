package The_MyTriangle_and_MyPoint_Classes;

public class TestMyTriangle {
	
	public static void main (String args[]) {
		
		MyTriangle t1 = new MyTriangle(2, 4, 6, 12, 8, 16);
		System.out.println(t1);
		System.out.println(t1.getPerimeter());
		System.out.println(t1.getType() + "\n\n");
		
		MyPoint p1 = new MyPoint(0, 0);
		MyPoint p2 = new MyPoint(2, 2);
		MyPoint p3 = new MyPoint(4, 4);
		MyTriangle t2 = new MyTriangle(p1, p2, p3);
		System.out.println(t2);
		System.out.println(t2.getPerimeter());
		System.out.println(t2.getType());
		
	}
}
