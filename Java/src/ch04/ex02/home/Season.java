package ch04.ex02.home;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		String season = "";
		
		System.out.print("몇 월? ");
		month = sc.nextInt();
		
		if(month >= 3 && month <= 5) season = "봄";
		else if(month >= 6 && month <= 8) season = "여름";
		else if(month >= 9 && month <= 11) season = "가을";
		else if(month < 3 && month == 12) season = "겨울";
		else season = "존재하지 않는 월";
		
		System.out.printf("%d월은 %s 입니다.", month, season);
		sc.close();
	}
}
