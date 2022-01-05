package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100);
		
		System.out.println(score);
		System.out.println(100+1);
		System.out.println((int)(Math.random()*100));
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");
		
		System.out.printf("%b, %c, %d, %.1f, %s \n", true, 'a', 10, 10.15, "hello");
		// 실수의 경우 자동으로 반올림됨
		System.out.printf("%-5b, %-5c, %d, %5.2f, %s \n", true, 'a', 10, 10.15, "hello");

		String name = "권민영";
		int age = 26;
		System.out.printf("%s은 %d살 입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살 입니다.");
		
	}
}
