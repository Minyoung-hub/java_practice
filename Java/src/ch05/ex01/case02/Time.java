package ch05.ex01.case02;

public class Time {
	int hour;
	int minute;
	int second;
	
	public String toString() {
		return String.format("%d:%d:%d", hour, minute, second);
	}
}
