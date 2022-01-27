package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			cnt = 0;
			do {
				System.out.print("*");
				cnt++;
			} while (cnt <= i);
			System.out.println();
		}

		String star = "*";
		for (int i = 0; i < 10; i++) {
			System.out.println(star);
			star += "**";
		}
	}
}
