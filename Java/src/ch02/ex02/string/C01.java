package ch02.ex02.string;

public class C01 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum : %d\n", sum);
		
		String concat = "" + a + b + c;
		System.out.println("concat : " + concat);
		
		String a2 = "" + a;
		System.out.println("a2 : " + a2);
		
		concat = a + b + "" + c;
		System.out.println("concat: " + concat);
		
		String dialog = "Jhon said, " + "\"hello\"";
		System.out.println(dialog);
	}
}
