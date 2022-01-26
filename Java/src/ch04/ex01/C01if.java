package ch04.ex01;

public class C01if {
	public static void main(String[] args) {
		int visitCnt = 0;
		if(visitCnt < 1) {
			System.out.println("첫방문.");
			visitCnt++;
		}
		if(visitCnt < 1) System.out.println("첫방문.");
	}
}
