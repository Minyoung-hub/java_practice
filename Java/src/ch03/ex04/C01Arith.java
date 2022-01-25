package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		byte c = (byte)(a + b);
		System.out.printf("c : %d\n", c);
//		c = (byte)(c + 1);

		c++;
		System.out.printf("c : %d\n", c);
		
		double d = a/b;
		System.out.printf("d : %.1f\n", d);
		
		d = 1.0 * a/b;
		System.out.printf("d : %.1f\n", d);
		
		// bad example
		d = (double)(a/b);
		d = a/b * 1.0;
	}
}
