package ch05.ex01.home;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person person = new Person();
		LocalDate localDate = LocalDate.now();

		System.out.print("이름을 입력하세요. >> "); person.setName(sc.nextLine());
		System.out.print("나이를 입력하세요. >> "); person.setAge(sc.nextInt());

		System.out.println(person);
		System.out.println("등록일 : " + localDate);
		
		sc.close();
	}
}
