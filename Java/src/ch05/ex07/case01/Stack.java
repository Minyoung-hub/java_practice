package ch05.ex07.case01;

public class Stack {
	public void first() {
		System.out.println("first() srart.");
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		
		this.second();
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		
		System.out.println("first() end.");
	}
	
	public void second() {
		System.out.println("second() start.");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		
		System.out.println("second() end.");
	}
}
