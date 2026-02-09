package Day_20_sorting;

import java.util.ArrayList;

class Student2 {
	int id;
	String name;
}

class Employee2 {
	String name;
	double[] salary;

	Employee2(String name, double[] salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Selection_Sort {

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

		for (int i = 0; i < n.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] < n[min]) {
					min = j;
				}
			}
			int temp = n[i];
			n[i] = n[min];
			n[min] = temp;
		}

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

		ArrayList<Student2> students = new ArrayList<>();

		Student2 s1 = new Student2();
		s1.id = 5;
		s1.name = "Aayush";
		Student2 s2 = new Student2();
		s2.id = 1;
		s2.name = "Rohit";
		Student2 s3 = new Student2();
		s3.id = 9;
		s3.name = "Ankit";
		Student2 s4 = new Student2();
		s4.id = 1;
		s4.name = "Neha";
		Student2 s5 = new Student2();
		s5.id = 7;
		s5.name = "Priya";
		Student2 s6 = new Student2();
		s6.id = 4;
		s6.name = "Karan";
		Student2 s7 = new Student2();
		s7.id = 1;
		s7.name = "Simran";
		Student2 s8 = new Student2();
		s8.id = 3;
		s8.name = "Rahul";
		Student2 s9 = new Student2();
		s9.id = 8;
		s9.name = "Sneha";
		Student2 s10 = new Student2();
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

		for (int i = 0; i < students.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(j).id < students.get(min).id) {
					min = j;
				}
			}
			Student2 temp = students.get(i);
			students.set(i, students.get(min));
			students.set(min, temp);
		}

		System.out.println();
		System.out.println("Printing sorted onject based on id");
		for (Student2 s : students) {
			System.out.println(s.id + " " + s.name);
		}

		for (int i = 0; i < students.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < students.size(); j++) {
				if (students.get(j).name.compareTo(students.get(min).name) < 0) {
					min = j;
				}
			}
			Student2 temp = students.get(i);
			students.set(i, students.get(min));
			students.set(min, temp);
		}

		System.out.println();
		System.out.println("Printing sorted onject based on name");
		for (Student2 s : students) {
			System.out.println(s.id + " " + s.name);
		}

		ArrayList<Employee2> e = new ArrayList<>();

		e.add(new Employee2("Aayush", new double[] { 30000, 32000, 31000, 33000 }));
		e.add(new Employee2("Rahul", new double[] { 30000, 32000, 30500 }));
		e.add(new Employee2("Priya", new double[] { 30000, 32000, 31500, 32500, 33000 }));
		e.add(new Employee2("Neha", new double[] { 35000, 34000, 36000 }));
		e.add(new Employee2("Karan", new double[] { 35000, 34000, 35500, 36500 }));
		e.add(new Employee2("Simran", new double[] { 27000, 28000, 29000, 29500 }));
		e.add(new Employee2("Vikas", new double[] { 27000, 28000, 28500 }));
		e.add(new Employee2("Sneha", new double[] { 31000, 33000, 32000, 34000, 35000 }));
		e.add(new Employee2("Rohit", new double[] { 38000, 39000, 40000, 41000 }));

		for (int i = 0; i < e.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < e.size(); j++) {
				if (comp(e.get(min).salary, e.get(j).salary)) {
					min = j;
				}
			}
			Employee2 temp = e.get(i);
			e.set(i, e.get(min));
			e.set(min, temp);
		}

		System.out.println();
		System.out.println("Printing custom sorted onject based on salaries of 3 months");

		for (Employee2 emp : e) {
			System.out.print(emp.name + " ");
			for (double sal : emp.salary) {
				System.out.print(sal + " ");
			}
			System.out.println();
		}
	}
}
