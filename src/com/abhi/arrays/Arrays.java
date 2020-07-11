package com.abhi.arrays;

public class Arrays {

	int size;
	int arr[];
	int count = 0;

	public Arrays(int size) {
		this.size = size;
		arr = new int[size];
	}

	public void insert(int value) {
		if (count >= size) {
			int newArr[] = new int[size * 2];
			int index = 0;
			for (int n : arr) {
				newArr[index++] = n;
			}
			newArr[index] = value;
			size = size * 2;
			arr = newArr;
			count++;
		} else {
			arr[count] = value;
			count++;
		}
	}

	public void removeAt(int index) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();

		for (int i = index; i < count; i++) {
			if(i == arr.length-1)
				arr[i] = 0;
			else
				arr[i] = arr[i+1];
		}
		count--;

	}

	@Override
	public String toString() {
		int finalArr[] = new int[count];
		for(int i=0;i<count;i++) {
			finalArr[i] = arr[i];
		}
		return java.util.Arrays.toString(finalArr);
	}

	public int indexOf(int index) {
		if (index < 0 || index >= count)
			throw new IllegalArgumentException("Index out of range");

		return arr[index];
	}

}
