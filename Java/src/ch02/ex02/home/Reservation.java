package ch02.ex02.home;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("공연일자를 입력하세요. ");
		System.out.print("year : ");
		year = sc.nextInt();
		System.out.print("month : ");
		month = sc.nextInt();
		System.out.print("day : ");
		day = sc.nextInt();
		
		LocalDate date = LocalDate.of(year, month, day);
		System.out.print("당신이 예매한 공연일자는 " + date + "이고, 예매 취소는 " + date.minusDays(3) + "일 까지 가능합니다.");
		sc.close();
	}
}
