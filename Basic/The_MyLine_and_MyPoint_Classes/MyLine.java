package The_MyLine_and_MyPoint_Classes;

public class MyLine {
	
	private MyPoint begin, end;
	
	MyLine(int x1, int y1, int x2, int y2){
		begin = new MyPoint(x1, y1);
		end = new MyPoint(x2, y2);
	}
	
	MyLine(MyPoint begin, MyPoint end) {
		this.begin = begin;
		this.end = end;
	}
	
	public MyPoint getBegin() {
		return this.begin;
	}
	
	public void setBegin(MyPoint begin) {
		this.begin = begin;
	}
	
	public MyPoint getEnd() {
		return this.end;
	}
	
	public void setEnd(MyPoint end) {
		this.end = end;
	}
	
	public int getBeginX() {
		return this.begin.x;
	}
	
	public void setBeginX(int x) {
		this.begin.x = x;
	}
	
	public int getBeginY() {
		return this.begin.y;
	}
	
	public void setBeginY(int y) {
		this.begin.y = y;
	}
	
	public int getEndX() {
		return this.end.x;
	}
	
	public void setEndX(int x) {
		this.end.x = x;
	}
	
	public int getEndY() {
		return this.end.y;
	}
	
	public void setEndY(int y) {
		this.end.y = y;
	}
	
	public int[] getBeginXY() {
		return new int[] {this.begin.x, this.begin.y};
	}
	
	public void setBeginXY(int x, int y) {
		this.begin.x = x;
		this.begin.y = y;
	}
	
	public int[] getEndXY() {
		return new int[] {this.end.x, this.end.y};
	}
	
	public void setEndXY(int x, int y) {
		this.end.x = x;
		this.end.y = y;
	}
	
	public double getLength() {
		return this.end.distance();
	}
	
	public double getGradient() {
		return Math.atan2(this.end.getY() - this.begin.getY(), this.end.getX() - this.begin.getX());
	}
	
	public String toString() {
		return String.format("MyLine[begin=(%d,%d),end=(%d,%d)]", this.begin.x, this.begin.y, this.end.x, this.end.y);
	}
}
