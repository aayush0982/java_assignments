package Feb_20_prac;
import java.util.*;
public class AnagramDemo {
	public static void main(String[] args) {
		String s1 = "ABCDEF";
		String s2 = "EFBCDA";
		Set<Character > st1 = new HashSet<>();
		Set<Character > st2 = new HashSet<>();
		for(char i:s1.toCharArray()) {
			st1.add(i);
		}
		for(char i:s2.toCharArray()) {
			st2.add(i);
		}
		boolean f = st1.equals(st2);
		System.out.println(f);
	}

}
