package ch05.ex04.case04;

public class Sequence {
	private static int baseNum;
	private int currNum;
	
	public static void setBaseNum(int myBaseNum) {
		baseNum = myBaseNum; // 여기에 사용하려면 baseNum도 static 변수여야함.
	}
	
	public int nextNum() {
		currNum = baseNum++;
		return currNum;
	}
}
