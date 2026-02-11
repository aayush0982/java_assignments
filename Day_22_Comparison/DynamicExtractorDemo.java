package Day_22_Comparison;

class Student {
    int studentId;
    String studentName;
    int studentAge;

    Student(int studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
}

interface Function<T, K> {
    K call(T obj);
}

class DynamicExtractor<T, K> {

    private Function<T, K> extractorFunction;

    DynamicExtractor(Function<T, K> extractorFunction) {
        this.extractorFunction = extractorFunction;
    }

    K extract(T obj) {
        return extractorFunction.call(obj);
    }
}

public class DynamicExtractorDemo {

    public static void main(String[] args) {
        Student student = new Student(1, "ABC", 23);

        DynamicExtractor<Student, String> nameExtractor =
                new DynamicExtractor<>(s -> s.studentName);

        System.out.println(nameExtractor.extract(student));
    }
}
