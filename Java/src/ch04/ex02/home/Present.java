package ch04.ex02.home;

import java.util.Scanner;

public class Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mainChoice = 0;
		int subChoice = 0;
		String prize = "";
		String brand = "";
		
		System.out.println("상품을 선택하세요.");
		System.out.print("1.냉장고, 2.세탁기\n>> ");
		mainChoice = sc.nextInt();
		
		switch(mainChoice) {
		case 1: prize = "냉장고"; break;
		case 2: prize = "세탁기"; break;
		default: prize = "뽀삐화장지";
		}
		
		switch(mainChoice) {
		case 1: case 2:
			System.out.println("브랜드를 선택하세요.");
			System.out.print("1.삼성, 2.엘지, 3.대우\n>> ");
			subChoice = sc.nextInt();
			
			switch(subChoice) {
			case 1: brand = "삼성"; break;
			case 2: brand = "엘지"; break;
			case 3: brand = "대우"; break;
			default : prize = "뽀삐화장지";
			}
		}
		prize = brand + prize;
		
		System.out.println("상품은 " + prize);
		
		sc.close();
	}
}
