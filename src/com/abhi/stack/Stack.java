package com.abhi.stack;

import java.util.Arrays;

public class Stack<E> {
	int size = 10;
	E arr[];
	int count = 0;

	public Stack() {
		arr = (E[]) new Object[size];
	}

	public void push(E val) {

		arr[count] = val;
		count++;

	}

	public void print() {
		E newArr[] = (E[]) new Object[count];
		for (int i = 0; i < count; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}

	public E pop() {
		if(isEmpty())
			throw new IllegalArgumentException("Stack is empty");
		E popVal = arr[count-1];
		count--;
		return popVal;
		
	}
	
	public boolean isEmpty() {
		if(count <= 0)
			return true;
		return false;
	}

	public E peek() {
		if(isEmpty())
			throw new IllegalArgumentException("Stack is empty");
		E popVal = arr[count-1];
		return popVal;	}

}
