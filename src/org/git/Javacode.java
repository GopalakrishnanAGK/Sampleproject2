package org.git;

import java.util.ArrayList;

public class Javacode {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Gokrish");
		l.add("Asus");
		l.add("Iphone");
		String s = l.get(0);
		System.out.println(s);
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("aaaa");
		System.out.println();
		l2.addAll(l);
		System.out.print(l2);
		l2.retainAll(l);
		System.out.println(l2);
	
	}
}
