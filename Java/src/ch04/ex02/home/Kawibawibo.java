package ch04.ex02.home;

import java.util.Scanner;

public class Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*3)+1;
		int me = 0;
		int result = 0;
		String guide = "";
		String comStr = "";
		String meStr = "";
		while(me < 1 || me > 3) {
			System.out.print("가위 바위 보를 합니다. 무엇을 내시겠습니까? 1.가위 2.바위 3.보 >> ");
			me = sc.nextInt();
			if(me < 1 || me > 3) System.out.println("1, 2, 3 중에 선택해주세요. 다시 시작합니다.");
		}
		result = me - com;
		switch(result) {
		case 1: case -2:
			guide = "당신이 이겼습니다.";
			break;
		case 2: case -1:
			guide = "컴퓨터가 이겼습니다.";
			break;
		case 0:
			guide = "비겼습니다.";
			break;
		default:
			guide = "오류입니다. 다시 시작해주세요. ";
		}
		switch(com) {
		case 1:
			comStr = "가위";
			break;
		case 2:
			comStr = "바위";
			break;
		case 3:
			comStr = "보";
			break;
		default:
			comStr = "오류";
		}
		switch(me) {
		case 1:
			meStr = "가위";
			break;
		case 2:
			meStr = "바위";
			break;
		case 3:
			meStr = "보";
			break;
		default:
			meStr = "오류";
		}
		System.out.printf("당신은 %s, 컴퓨터는 %s, %s", meStr, comStr, guide);
		
		sc.close();
	}
}
