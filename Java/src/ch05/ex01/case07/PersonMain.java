package ch05.ex01.case07;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();

		person.setName("권민영");
		person.setAge(26);
		
		System.out.printf("%s,%d", person.getName(), person.getAge());
	}
}
