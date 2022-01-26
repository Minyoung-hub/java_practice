package ch04.ex03.home;

public class H01Lunch {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 1;
		
		while(calorie < 30 && food % 5 != 0) {
			food = (int)(Math.random() * 10) + 1;
			System.out.print(food + "cal.");
			if(food % 5 != 0) {
				System.out.println(" 먹다.");
				calorie += food;
			}else System.out.println(" 뱉다.");
		}
		
		System.out.println();
		System.out.printf(calorie + "cal. 만큼 먹었습니다");
	}
}
