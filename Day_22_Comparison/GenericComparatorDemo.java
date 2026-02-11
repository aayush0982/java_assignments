package Day_22_Comparison;

interface Comparator1<T> {
    int compare(T a, T b);
}

class UniversalComparator1<T> implements Comparator1<T> {
    public int compare(T a, T b) {
        if (a == null && b == null) return 0;
        if (a == null) return -1;
        if (b == null) return 1;

        if (a instanceof Integer && b instanceof Integer) {
            return (Integer) a - (Integer) b;
        }

        if (a instanceof String && b instanceof String) {
            return ((String) a).compareTo((String) b);
        }

        throw new RuntimeException("Unsupported type");
    }
}

public class GenericComparatorDemo {
    public static void main(String[] args) {
        Comparator1<Integer> intCmp = new UniversalComparator1<Integer>();
        System.out.println(intCmp.compare(10, 20));

        Comparator1<String> strCmp = new UniversalComparator1<String>();
        System.out.println(strCmp.compare("ABC", "BCD"));
    }
}
