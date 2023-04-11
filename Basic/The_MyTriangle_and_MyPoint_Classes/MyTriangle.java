package The_MyTriangle_and_MyPoint_Classes;

public class MyTriangle {
	
	private MyPoint v1, v2, v3;
	
	MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}
	
	MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	@Override
	public String toString() {
		return String.format("MyTriangle[v1=(%d, %d),v2=(%d, %d),v3=(%d, %d)]", this.v1.getX(), this.v1.getY(), this.v2.getX(), this.v2.getY(), this.v3.getX(), this.v3.getY());
	}
	
	public double getPerimeter() {
		return ((v1.distance(v2))+(v2.distance(v3))+(v3.distance(v1)));
	}
	
	public String getType() {
		if (v1.distance(v2) == v1.distance(v2) && v2.distance(v1) == v2.distance(v3) && v3.distance(v1) == v3.distance(v2)) {
			return "equilateral";
		} else if (v1.distance(v2) == v1.distance(v3) || v2.distance(v1) == v2.distance(v3) || v3.distance(v1) == v3.distance(v2)) {
			return "isoscele";
		} else {
			return "scalene";
		}
	}

}