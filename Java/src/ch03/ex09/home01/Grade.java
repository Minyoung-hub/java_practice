/*
 * 국, 영, 수 점수를 입력받은 뒤, 총점, 평균, 학점을 출력하라.
 * 평균 학점
 * 90점대 A (100점 포함)
 * 80점대 B
 * 70점대 C
 * 나머지 D
 */

package ch03.ex09.home01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sum = 0;
		double avg = 0.0;
		char grade = 0;
		System.out.print("국어 점수를 입력하세요 : "); kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : "); eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : "); math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3.0;
		grade = avg >= 90 ? 'A' : (avg >= 80 ? 'B' : (avg >= 70 ? 'C' : 'D'));
		System.out.printf("총점은 %d, 평균은 %.1f, 학점은 %c입니다.", sum, avg, grade);
		
		sc.close();
	}
}
