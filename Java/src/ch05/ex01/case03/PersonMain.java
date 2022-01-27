package ch05.ex01.case03;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "권민영";
		person.age = 26;
		
		System.out.printf("%s은(는) %d살 입니다.", person.name, person.age);
	}
}
