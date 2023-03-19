package The_Circle_Class;

public class Circle {

	private double radius = 1.0;
	private String color = "red";
	
	Circle(){
		System.out.print("default constructor, no paramanter called.");
	}
	
	Circle(double radius){
		this.radius = radius;
		System.out.print("default constructor, parameter radius called.");
	}
	
	
	Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
		System.out.print("default contructor, parameter radius and parameter color called.");
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*(Math.pow(this.radius, 2));
	}
	
	public double getCircumference() {
		return 2*(Math.PI*radius);
	}
	
	public String toString() {
		return "Circle[radius=" + this.radius + " color= " + this.color +"]";
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String setColor(String color) {
		return this.color = color;
	}
}
