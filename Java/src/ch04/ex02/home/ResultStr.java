package ch04.ex02.home;

public class ResultStr {
	int resultStr;

	public String getResultStr() {
		switch(resultStr) {
		case 1:
			return "가위";
		case 2:
			return "바위";
		case 3:
			return "보";
		default:
			return "오류";
		}
	}

	public void setResultStr(int resultStr) {
		this.resultStr = resultStr;
	}
	
	
}
