package ch04.ex05;

public class C04Three69 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			int ten = i/10;
			int one = i%10;
			String crab = "";
			
			if(one % 3 == 0 && one != 0) crab += "짝";
			if(ten % 3 == 0 && ten != 0) crab += "짝";
			if(crab.equals("") || crab == null) System.out.printf("%-4d", i);
			else {
				System.out.printf("%-5s", crab);
				crab = "";
			}
			
			if(one == 0) System.out.println();
		}
	}
}
