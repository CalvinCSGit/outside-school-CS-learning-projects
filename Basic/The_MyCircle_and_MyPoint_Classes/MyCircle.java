package The_MyCircle_and_MyPoint_Classes;

public class MyCircle {
	
	private MyPoint center = new MyPoint(0, 0);
	private int radius = 1;
	
	MyCircle(){
		
	}
	
	MyCircle(int x, int y, int radius) {
		this.center.setX(x);
		this.center.setY(y);
		this.radius = radius;
	}
	
	MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return this.center;
	}
	
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX() {
		return this.center.getX();
	}
	
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	
	public int getCenterY() {
		return this.center.getY();
	}
	
	public void setCenterY(int y) {
		this.center.setY(y);
	}
	
	public int[] getCenterXY() {
		return new int[] {this.center.getX(), this.center.getY()};
	}
	
	public void setCenterXY(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}
	
	public String toString() {
		return String.format("MyCircle[radius=%d,center=%s]", this.radius, this.center);
	}
	
	public double getArea() {
		return Math.PI*(Math.pow(this.getRadius(), 2));
	}
	
	public double getCircumference() {
		return 2*(Math.PI*(this.getRadius()));
	}
	
	public double distance(MyCircle another) {
		return this.center.distance(another.center);
	}
	
}
