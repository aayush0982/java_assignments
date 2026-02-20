package Feb_20_prac;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		List<Integer> l = (List<Integer>) list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(l);
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
