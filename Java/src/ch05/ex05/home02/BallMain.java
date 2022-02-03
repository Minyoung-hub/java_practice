package ch05.ex05.home02;

import java.util.Scanner;

public class BallMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BallMachine bm = new BallMachine();
		char choice = 0;
		do {
			System.out.println("공을 뽑습니다.");
			System.out.println(bm.pull());
			System.out.print("다시 뽑겠습니까(y/n)? ");
			choice = sc.nextLine().charAt(0);
		}while(choice == 'y');
		System.out.println("시스 템을 종료합니다.");
		sc.close();
	}
}
