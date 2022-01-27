package ch05.ex03.home;

public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setName("권민영");
		student1.setAge(20);
		student2.setName("이선행");		
		student2.setAge(30);
		
		student1.wakeUp();		
		student1.washFace();
		student2.studyHard();
	}
}
