package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;
		System.out.println("d: " + d);
		
		d = (double)i;
		System.out.println("d: " + d);

		i = (int)d;
		System.out.println("i: " + i);
		System.out.println("d: " + d);

	}
}
