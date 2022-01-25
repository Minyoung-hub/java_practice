package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = (int)(pi * 10)/10d;
		System.out.println("short pi : " + shortPi);

		shortPi = (int)(pi * 1000)/1000d;
		System.out.println("short pi : " + shortPi);
		
		shortPi = Math.round(pi * 1000)/1000d;
		System.out.println("short pi : " + shortPi);
		
		shortPi = Math.floor(pi * 1000)/1000d;
		System.out.println("short pi : " + shortPi);
			
	}
}
