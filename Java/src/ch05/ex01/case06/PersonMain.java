package ch05.ex01.case06;

public class PersonMain {
	public static void main(String[] args) {
		Person person = new Person();

		person.setName("권민영");
		person.setAge(26);
		System.out.printf("%s은(는) %d살 입니다.\n", person.getName(7), person.getAge(7));
		System.out.printf("%s은(는) %d살 입니다.\n", person.getName(4), person.getAge(4));

		person.setName("최민영");
		person.setAge(30);
		System.out.printf("%s은(는) %d살 입니다.\n", person.getName(7), person.getAge(7));

//		person.name = "이선행";
//		person.age = 27;
//		String name = person.name;
//		int age = person.age;
//		System.out.printf("%s은(는) %d살 입니다.\n", name, age);

	}
}
