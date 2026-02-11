package assignment_feb_11;

import java.util.Stack;

public class ReverseArrayUsingStack {

	static void reverseArray(int[] arr) {
		Stack<Integer> stk = new Stack<>();
		for (int num : arr)
			stk.push(num);

		for (int i = 0; i < arr.length; i++)
			arr[i] = stk.pop();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.print("Original Array: ");
		for (int n : arr) {
			System.out.print(n + " ");
		}

		System.out.println();

		reverseArray(arr);

		System.out.print("Reversed Array: ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
}