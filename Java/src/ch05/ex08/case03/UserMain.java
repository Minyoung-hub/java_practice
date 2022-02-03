package ch05.ex08.case03;

import java.util.Date;

public class UserMain {
	public static void main(String[] args) {
		User user1 = new User("권민영", 27, new Date());
		User user2 = new User("이선행", 26, new Date());
		
		User user3 = new User();
		user3.setUserName("권민일");
		user3.setAge(31);
		user3.setRegDate(new Date());
		
		System.out.printf("%s\n%s\n%s", user1, user2, user3);
	}
}
