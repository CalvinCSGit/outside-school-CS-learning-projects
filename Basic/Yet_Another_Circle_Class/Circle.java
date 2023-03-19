package Yet_Another_Circle_Class;

public class Circle {
	
	private double radius = 1.0;
	
	Circle(){
		
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*(Math.pow(radius, 2));
	}
	
	public double getCircumference() {
		return 2*(Math.PI*this.radius);
	}
	
	public String toString() {
		return "Circle [radius = " + this.radius + "]";
	}
}
