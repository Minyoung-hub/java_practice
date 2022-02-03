package ch05.ex06.case01;

public class ManMain {
	public static void main(String[] args) {
		Man.say("I love java.");
//		Man.tell("I love php");
		
		Man man = new Man();
		man.say("I love java.");
		man.tell("I love java, too.");
	}
}
