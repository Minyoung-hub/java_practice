package ch05.ex05.home01;

import java.util.Scanner;

public class DiceMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		char cont = 0;
		
		do {
			System.out.println("주사위를 굴립니다. 주사위 값은 " + dice.getNumber());
			System.out.print("주사위를 다시 굴리시겠습니까?(y/n) "); cont = sc.nextLine().charAt(0);
		}while(cont == 'y');
		
		System.out.println("시스템을 종료합니다.");
		sc.close();
	}
}
