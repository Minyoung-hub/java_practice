package ch05.ex02.home;

import java.util.Scanner;

public class MemoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Memo memo = new Memo();
		
		System.out.print("메모에 남길 메세지를 입력하세요 >> "); memo.setMsg(sc.nextLine());
		System.out.print("메모를 남기신 분의 이름을 입력하세요 >> "); memo.setName(sc.nextLine());
		
		System.out.println(memo);
		sc.close();
	}
}
