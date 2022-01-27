package ch05.ex03.case04;

public class CatMain {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.setColor("white");
		cat2.setColor("black");
		
		cat1.eat();
		cat1.sleep();
	}
}
