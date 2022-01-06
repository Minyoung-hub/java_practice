package ch02.ex02.integer;

public class C01 {
	public static void main(String args[]) {
		int x = 10;
		System.out.println(Integer.toString(x));
		
		x = 012;
		System.out.println(Integer.toString(x));
		
		x = 0xA;
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010;
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_456;
		System.out.println(x);
		
		double y = 1e1;
		System.out.println(y);
	}
}
