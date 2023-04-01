package The_MyLine_and_MyPoint_Classes;

import java.util.Arrays;

public class TestMain {
	public static void main(String args[]) {
		MyPoint p1 = new MyPoint();
		System.out.println(p1);
		p1.setX(10);
		System.out.println("Point p1 x value : " + p1.getX());
		p1.setY(20);
		System.out.printf("Point p1 y value : %d\n", p1.y);
		p1.setXY(22, 44);
		System.out.printf("Point p1 x and y values [x, y] : %s\n", Arrays.toString(p1.getXY()));
		System.out.printf("Distance from point [%d, %d] : %.2f\n", p1.x, p1.y, p1.distance());
		
		
		MyPoint p2 = new MyPoint(40, 80);
		System.out.println("\n\n" + p2);
		System.out.printf("%.2f\n", p2.distance(p1));
		System.out.println("The distance between coordinate p2 and coordinate(10,20) : " + p2.distance(10,20) + "\n");
		
		MyLine l1 = new MyLine(p1, p2);
		System.out.println(l1);
		System.out.println("The beginning coordinate for line 1 :" + l1.getBegin());
		MyPoint p3 = new MyPoint(6,12);
		l1.setBegin(p3);
		System.out.println("The x value of l1 begin coordinate is : " + l1.getBeginX() + ", the y value of line l1 begin coordinate is : " + l1.getBeginY());
		MyPoint p4 = new MyPoint(200,400);
		l1.setEnd(p4);
		System.out.println("the end coordinate of line l1 is : " + l1.getEnd());
		
		MyLine l2 = new MyLine(2, 4, 6, 12);
		System.out.println("\n\n" + l2);
		l2.setEndX(24);
		System.out.printf("The end coordinate of l2, x value is : %d\n", l2.getEndX());
		l2.setEndY(48);
		System.out.printf("The end coordinate of l2, y value is : %d\n", l2.getEndY());
		l2.setBeginXY(1, 2);
		System.out.println("the begin coordinate of l2, x and y values respectively [x, y] : " + Arrays.toString(l2.getBeginXY()));
		l2.setEndXY(3, 4);
		System.out.println("the end coordinate of l2, x and y values respectively [x, y] : " + Arrays.toString(l2.getEndXY()));
		System.out.printf("l2 length = %.2f\n", l2.getLength());
		System.out.printf("l2 gradient = %.2f", l2.getGradient());
		
	}

}
