package ch04.ex02;

public class C02SwitchStr {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold": coupon+="10,000won ";
		case "silver": coupon += "5,000won ";
		case "coper": coupon += "1,000won ";
		
		System.out.print(coupon);
		}
	}
}
