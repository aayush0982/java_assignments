package assignment_10_Feb;

import java.util.*;

class ArrayListTask {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();

		marks.add(85);
		marks.add(72);
		marks.add(90);
		marks.add(65);
		marks.add(88);

		marks.add(2, 80);

		int min = Collections.min(marks);
		marks.remove(Integer.valueOf(min));

		System.out.println("Final Marks List: " + marks);
	}
}
