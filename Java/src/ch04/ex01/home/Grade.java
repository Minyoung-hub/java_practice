package ch04.ex01.home;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0, total = 0;
		double avg = 0.0;
		char grade = 0;
		
		System.out.println("점수를 입력하세요.");
		System.out.print("국어 : "); kor = sc.nextInt();
		System.out.print("영어 : "); eng = sc.nextInt();
		System.out.print("수학 : "); math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0;
		if(avg >= 90) grade = 'A';
		else if(avg >= 80) grade = 'B';
		else if(avg >= 70) grade = 'C';
		else grade = 'D';
		
		System.out.printf("총점은 %d, 평균은 %.1f, 학점은 %c 입니다.", total, avg, grade);
	}
}
