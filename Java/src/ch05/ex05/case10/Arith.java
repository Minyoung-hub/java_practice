package ch05.ex05.case10;

public class Arith {
	public int add(int a, int b) {
		return a + b;
	}
	
	public void add(Paper paper) {
		paper.setSum(paper.getX() + paper.getY());
	}
}
