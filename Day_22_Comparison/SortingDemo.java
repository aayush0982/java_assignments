package Day_22_Comparison;

class Student12 {
    int id;
    String name;
    int age;

    Student12(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

interface MyComparator<T> {
    int compare(T a, T b);
}

class StudentAgeComparator implements MyComparator<Student12> {
    public int compare(Student12 a, Student12 b) {
        return a.age - b.age;
    }
}

class SortHelper {

    static <T> void sortArray(T[] data, MyComparator<T> cmp) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cmp.compare(data[j], data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}

public class SortingDemo {

    public static void main(String[] args) {

        Student12[] students = {
                new Student12(1, "A", 23),
                new Student12(2, "B", 20),
                new Student12(3, "C", 25),
                new Student12(4, "D", 21)
        };

        MyComparator<Student12> ageComparator = new StudentAgeComparator();

        SortHelper.sortArray(students, ageComparator);

        for (Student12 s : students) {
            System.out.println(s.id + " " + s.name + " " + s.age);
        }
    }
}
