package ch04.ex03;

public class C03Lunch {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		int cnt = 0;
		
		while(calorie<30) {
			food = (int)(Math.random() * 10) + 1;
			System.out.print(food + "cal");
			if(food % 5 == 0) {
				System.out.println(" 뱉다.");
				cnt++;
				continue;
//				break;
			}
			System.out.println(" 먹다.");
			calorie += food;
			cnt++;
		}
		System.out.println();
		System.out.printf("%d번 %dcal. 만큼 먹었습니다.",cnt, calorie);
	}
}
