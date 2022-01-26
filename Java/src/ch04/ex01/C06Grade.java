package ch04.ex01;

public class C06Grade {
	public static void main(String[] args) {
		int score = 87;
		String grade = "";
		
		System.out.println("score : " + score);
		if(score >= 90) {
			grade = "A";
			if(score >= 98) grade += "+";
			else if(score < 94) grade += "-";
		}else if(score >= 80) {
			grade = "B";
			if(score >= 88) grade += "+";
			else if(score < 84) grade += "-";
		}else grade = "C";
		
//		if(score >= 90) grade = "A";
//		else if(score >= 80) grade = "B";
//		else grade ="C";
//		
//		if(score % 10 >= 8 || score / 10 == 10) grade += "+";
//		else if(score % 10 < 4) grade += "-";
		System.out.println("grade : " + grade);
	}
}
