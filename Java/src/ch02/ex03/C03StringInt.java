package ch02.ex03;

public class C03StringInt {
	public static void main(String[] args) {
		int i = 1;
		String str = "" + i;
		System.out.println("i : " + i);
		
		i = Integer.parseInt(str);
		int result = i + 1;
		System.out.println("result : " + result);
	}
}
