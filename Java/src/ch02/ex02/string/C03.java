package ch02.ex02.string;

//import java.util.Scanner;

public class C03 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		StringBuffer src = new StringBuffer(sc.nextLine());
	
		StringBuffer src = new StringBuffer("우리 개는 ");
		
		int len = src.length();
		System.out.println("length : " + len);
		
		src.append("짖는다.");
		src.replace(3, 4, "고양이");
		
		System.out.printf("src : %s\n", src);
		
		String str = src.toString();
		System.out.printf("str : %s\n", str);
	}
}
