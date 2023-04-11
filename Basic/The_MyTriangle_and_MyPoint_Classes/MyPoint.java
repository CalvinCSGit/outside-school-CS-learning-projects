package The_MyTriangle_and_MyPoint_Classes;

public class MyPoint {
	
	int x = 0, y = 0;
	
	MyPoint(){
		
	}
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		return new int[] {this.x, this.y};
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d)", this.x, this.y);
	}
	
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(this.y - y, 2) + Math.pow(this.x - x, 2));
	}
	
	public double distance(MyPoint another) {
		return Math.sqrt(Math.pow(this.y - another.y, 2) + Math.pow(this.x - another.x, 2));
	}
	
	public double distance() {
		return Math.sqrt(Math.pow(this.y - 0, 2) + Math.pow(this.x - 0, 2));
	}

}
