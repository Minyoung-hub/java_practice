package ch05.ex01.case04;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("권민영");
		person.setAge(26);
		
		System.out.printf("%s은(는) %d살 입니다.", person.getName(), person.getAge());
	}
}
