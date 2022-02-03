package ch05.ex09.case01;

public class InitMain {
	public static void main(String[] args) {
		Init init = new Init();
		System.out.println();
		
		init = new Init();
		System.out.println();
		
		init = new Init("hello");
		System.out.println();
		
		Init init2 = new Init("hell");
		System.out.println();
		
		Init init3 = new Init();
	}
}
