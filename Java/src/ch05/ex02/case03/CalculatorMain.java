package ch05.ex02.case03;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println("덧   셈 : " + calc.add(1, 2));
		System.out.println("뺄   셈 : " + calc.minus(3, 4));
		System.out.println("곱   셈 : " + calc.multiply(5, 6));
		System.out.println("나눗셈 : " + calc.devide(7, 8));
	}
}
