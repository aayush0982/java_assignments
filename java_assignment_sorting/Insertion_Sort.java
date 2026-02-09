package Day_20_sorting;

import java.util.ArrayList;

class Student1 {
	int id;
	String name;
}

class Employee1 {
	String name;
	double[] salary;

	Employee1(String name, double[] salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Insertion_Sort {

	static boolean comp(double[] a, double[] b) {
		boolean flag = false;
		int n = Math.min(a.length, b.length);
		for (int i = 0; i < n; i++) {
			if (a[i] > b[i]) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		int[] n = { 3, 4, 5, 6, 7, 8, 9, 3, 2, 5, 1, 7 };

		for (int i = 1; i < n.length; i++) {
			int key = n[i];
			int j = i - 1;
			while (j >= 0 && n[j] > key) {
				n[j + 1] = n[j];
				j--;
			}
			n[j + 1] = key;
		}

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

		ArrayList<Student1> students = new ArrayList<>();

		Student1 s1 = new Student1();
		s1.id = 5;
		s1.name = "Aayush";
		Student1 s2 = new Student1();
		s2.id = 1;
		s2.name = "Rohit";
		Student1 s3 = new Student1();
		s3.id = 9;
		s3.name = "Ankit";
		Student1 s4 = new Student1();
		s4.id = 1;
		s4.name = "Neha";
		Student1 s5 = new Student1();
		s5.id = 7;
		s5.name = "Priya";
		Student1 s6 = new Student1();
		s6.id = 4;
		s6.name = "Karan";
		Student1 s7 = new Student1();
		s7.id = 1;
		s7.name = "Simran";
		Student1 s8 = new Student1();
		s8.id = 3;
		s8.name = "Rahul";
		Student1 s9 = new Student1();
		s9.id = 8;
		s9.name = "Sneha";
		Student1 s10 = new Student1();
		s10.id = 6;
		s10.name = "Arjun";

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		students.add(s7);
		students.add(s8);
		students.add(s9);
		students.add(s10);

		for (int i = 1; i < students.size(); i++) {
			Student1 key = students.get(i);
			int j = i - 1;
			while (j >= 0 && students.get(j).id > key.id) {
				students.set(j + 1, students.get(j));
				j--;
			}
			students.set(j + 1, key);
		}

		System.out.println();
		System.out.println("Printing sorted onject based on id");
		for (Student1 s : students) {
			System.out.println(s.id + " " + s.name);
		}

		for (int i = 1; i < students.size(); i++) {
			Student1 key = students.get(i);
			int j = i - 1;
			while (j >= 0 && students.get(j).name.compareTo(key.name) > 0) {
				students.set(j + 1, students.get(j));
				j--;
			}
			students.set(j + 1, key);
		}

		System.out.println();
		System.out.println("Printing sorted onject based on name");
		for (Student1 s : students) {
			System.out.println(s.id + " " + s.name);
		}

		ArrayList<Employee1> e = new ArrayList<>();

		e.add(new Employee1("Aayush", new double[] { 30000, 32000, 31000, 33000 }));
		e.add(new Employee1("Rahul", new double[] { 30000, 32000, 30500 }));
		e.add(new Employee1("Priya", new double[] { 30000, 32000, 31500, 32500, 33000 }));
		e.add(new Employee1("Neha", new double[] { 35000, 34000, 36000 }));
		e.add(new Employee1("Karan", new double[] { 35000, 34000, 35500, 36500 }));
		e.add(new Employee1("Simran", new double[] { 27000, 28000, 29000, 29500 }));
		e.add(new Employee1("Vikas", new double[] { 27000, 28000, 28500 }));
		e.add(new Employee1("Sneha", new double[] { 31000, 33000, 32000, 34000, 35000 }));
		e.add(new Employee1("Rohit", new double[] { 38000, 39000, 40000, 41000 }));

		for (int i = 1; i < e.size(); i++) {
			Employee1 key = e.get(i);
			int j = i - 1;
			while (j >= 0 && comp(e.get(j).salary, key.salary)) {
				e.set(j + 1, e.get(j));
				j--;
			}
			e.set(j + 1, key);
		}

		System.out.println();
		System.out.println("Printing custom sorted onject based on salaries of 3 months");

		for (Employee1 emp : e) {
			System.out.print(emp.name + " ");
			for (double sal : emp.salary) {
				System.out.print(sal + " ");
			}
			System.out.println();
		}
	}
}
