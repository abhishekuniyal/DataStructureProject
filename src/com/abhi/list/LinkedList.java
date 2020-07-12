package com.abhi.list;

import java.util.NoSuchElementException;

public class LinkedList<E> {

	Node<E> first;
	Node<E> last;

	public LinkedList() {
		first = last = null;
	}

	public void addLast(E value) {
		Node<E> newNode = new Node(value);

		if (first == null)
			first = last = newNode;
		else {
			Node<E> curr = first;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
			last = newNode;
		}

	}

	public void print() {
		Node<E> curr = first;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
	}

	public int indexOf(E val) {
		Node<E> curr = first;
		int index = 0;
		while (curr != null) {
			if (curr.value == val) {
				return index;
			}

			curr = curr.next;
			index++;
		}

		return -1;
	}

	public boolean contains(E val) {
		if (isEmpty())
			throw new NoSuchElementException("List is empty");

		Node<E> curr = first;
		boolean falg = false;
		while (curr != null) {
			if (curr.value == val) {
				return true;
			}

			curr = curr.next;
		}
		return false;
	}

	public void removeFirst() {
		// 1->2->3->4
		if (isEmpty())
			throw new NoSuchElementException("List is empty");

		Node<E> second = first.next;
		first.next = null;
		first = second;

	}

	public boolean isEmpty() {
		if (first == null)
			return true;
		else
			return false;
	}

	public void removeLast() {

		// 1-->2-->3-->4

		if (isEmpty())
			throw new NoSuchElementException("List is empty");

		Node<E> curr = first;
		Node<E> preToLast = null;

		while (curr != null) {
			if(curr.next == last)
				break;
			curr = curr.next;
		}
		
		preToLast = curr;
		last = preToLast;
		preToLast.next = null;

	}
	
	public void printLast(){
		System.out.println("Last is :::"+last.value);
	}

	public int size() {
		Node<E> curr =  first;
		int size = 0;
		while(curr != null) {
			curr = curr.next;
			size++;
		}
		return size;
	}

	public<E> E[] toArray() {
		E arr[] = (E[]) new Object[size()];
		int index = 0;
		
		Node curr = first;
		
		while(curr != null ) {
			arr[index++] = (E)curr.value;
			curr = curr.next;
		}
		return arr;
	}

	public void reverse() {
		// TODO Auto-generated method stub
		// 10->20->30
		
	}

}
