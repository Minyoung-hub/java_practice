package ch05.ex07.case02;

public class Stack {
	public void first() {
		System.out.println("first() Start.");
		this.second();
		System.out.println("first() End.");
	}
	
	public void second() {
		System.out.println("second() Start.");
		System.out.println("second() End.");
	}
}
