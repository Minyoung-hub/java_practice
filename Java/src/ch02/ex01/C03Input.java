package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 : ");
		String s = sc.nextLine();
		System.out.printf("'%s'을(를) 입력하였습니다. \n", s);
		
		System.out.print("숫자를 입력해주세요 :");
		int num = sc.nextInt(); sc.nextLine();
		System.out.printf("'%d'를 입력하였습니다. \n", num);
		
		System.out.print("문자열을 입력해주세요 : ");
		s = sc.nextLine();
		System.out.printf("'%s'를 입력하였습니다. \n", s);
		
		System.out.print("문자를 입력해주세요 : ");
		char c = sc.nextLine().charAt(0);
		System.out.printf("'%c'를 입력하였습니다.", c);
	}
}
