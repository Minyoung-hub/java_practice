package ch06.ex03.case06;

public class Circle extends Point {
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}
	
	public String toString() {
		return String.format("중심점(%d, %d) 반지름 : %d", x, y, r);
	}
}
