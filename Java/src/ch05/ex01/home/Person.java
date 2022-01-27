package ch05.ex01.home;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return String.format("입력하신 1명의 정보는 다음과 같습니다.\n이   름 : %s\n나   이 : %d", name, age);
	}
}
