package ch04.ex03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01While2 {
	public static void main(String[] args) {
		String str = "aaaabbbvvvvddd";
		String[] array = str.split("");
		for(String s : array) System.out.println(s);
		List<String> list = Arrays.asList(array);
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
	}
}
