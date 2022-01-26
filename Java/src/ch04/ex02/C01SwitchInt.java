package ch04.ex02;

public class C01SwitchInt {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		switch(grade){
		case 3: coupon += "10,000won ";
		case 2: coupon += "5,000won ";
		case 1: coupon += "1,000won ";
		}
		System.out.println(coupon);
	}
}
