package The_MyPoint_Class;

public class MyPoint {
	
	private int x = 0, y = 0;
	
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
		return new int[]{this.x,this.y};
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("(%d,%d)", this.x, this.y);
	}
	
	public double distance(int x, int y) {
		return Math.sqrt((this.y - y)+(this.x - x));
	}
	
	public double distance(MyPoint another) {
		return Math.sqrt((this.y - another.getY())+(this.x - another.getX()));
	}
	
	public double distance() {
		return Math.sqrt((this.y - 0)+(this.x-0));
	}
	
}
