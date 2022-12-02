package example;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("world");
		list.add("java");
		
		System.out.println(list.indexOf("world"));
		int index = list.indexOf("world");
		list.remove(index);
		System.out.println(list);
		
		list.remove("Hello");
		System.out.println(list);
	}
}
