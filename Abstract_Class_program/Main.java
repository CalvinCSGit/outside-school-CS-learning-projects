package Abstract_Class_program;

public class Main {
	
	
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}
}
