package com.abhi.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);

		list.print();
		list.printLast();
		
		System.out.println(list.indexOf(10));
		System.out.println(list.contains(40));
		
		//list.removeFirst();
		//list.printLast();
		
		//list.removeLast();
		//list.removeLast();
		list.printLast();
		list.print();
		
		System.out.println(list.size());
		
		System.out.println(Arrays.toString(list.toArray()));

		/*
		LinkedList<String> liString = new LinkedList();
		liString.addLast("A");
		liString.addLast("B");
		liString.print();

		System.out.println(liString.indexOf("B"));
		System.out.println(liString.contains("C"));
*/
		
		list.reverse();
		
		
	}
	

}
