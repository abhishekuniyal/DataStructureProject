package com.abhi.arrays;

public class ArraysApp {

	public static void main(String[] args) {
		Arrays numbers = new Arrays(3);
		
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		
		numbers.insert(40);
		numbers.insert(50);
		numbers.insert(60);
		numbers.insert(70);
	
		System.out.println(numbers);
		
		numbers.removeAt(2);
		
		System.out.println(numbers);
		
		System.out.println(numbers.indexOf(1));

	}

}
