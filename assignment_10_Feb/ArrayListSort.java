package assignment_10_Feb;

import java.util.*;

class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.addAll(Arrays.asList(10, 25, 30, 17, 42, 55, 60, 8, 19, 90));

		numbers.removeIf(n -> n % 2 == 0);

		int max = Collections.max(numbers);
		int min = Collections.min(numbers);

		numbers.sort(Collections.reverseOrder());

		System.out.println("Final List: " + numbers);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}
}
