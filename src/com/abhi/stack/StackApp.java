package com.abhi.stack;

import java.util.Stack;

public class StackApp {

	public static void main(String[] args) {

		reverseString();
		System.out.println(compiler("[{((1+2)}]"));
		
		
		com.abhi.stack.Stack<Integer> stack = new com.abhi.stack.Stack<>();
		
		stack.push(10);
		stack.push(20);
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.print();

	}

	private static boolean compiler(String s) {

		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if ((c == '[') || (c == '{') || (c == '('))
				stack.push(c);

			if ((c == ']') || (c == '}') || (c == ')')) {
				if (stack.isEmpty())
					return false;

				Character pop = stack.pop();

				if ((c == '[' && pop != '[') || (c == '{' && pop != '}') || (c == '(' && pop != ')')) {
					return false;
				}
			}

		}
		return stack.isEmpty();

	}

	private static void reverseString() {
		String str = "abcd";

		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray())
			stack.push(c);

		StringBuffer sb = new StringBuffer();

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb.toString());
	}

}
