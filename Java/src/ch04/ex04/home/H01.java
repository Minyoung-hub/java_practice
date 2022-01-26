package ch04.ex04.home;

import java.util.Scanner;

public class H01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		double result = 0;
		String oper = "";
		String cont = "";
		
		do {
			System.out.print("첫 번째 숫자를 입력해주세요 : "); num1 = sc.nextInt(); sc.nextLine();
			System.out.print("연산 기호를 입력해주세요(+, -, *, /) : "); oper = sc.nextLine();
			System.out.print("두 번째 숫자를 입력해주세요 : "); num2 = sc.nextInt(); sc.nextLine();
			
			switch(oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = 1.0 * num1 / num2;
				break;
			default:
				cont = "y";
				System.out.println("연산기호를 다시 입력해주세요.");
			}
			if(oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
				do{
					System.out.printf("%d %s %d = %.1f 입니다. 다시하시겠습니까?(y/n) : ", num1, oper, num2, result);
					cont = sc.nextLine();
					if(!cont.equals("y") && !cont.equals("n")) System.out.println("y또는 n을 입력해주세요.");
				}while(!cont.equals("y") && !cont.equals("n"));
			}else {
				cont = "y";
				System.out.println("연산기호는 +, -, *, / 중에서 입력해주세요.");
			}
		}while(cont.equals("y"));
		System.out.println("끝.");
		sc.close();
	}
}
