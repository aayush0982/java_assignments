package Feb_20_prac;

import java.util.*;

public class ReversedStringM1 {
	char replaceVowel(char c) {
		return switch (c) {
		case 'a' -> 'e';
		case 'e' -> 'i';
		case 'i' -> 'o';
		case 'o' -> 'u';
		case 'u' -> 'a';
		case 'A' -> 'E';
		case 'E' -> 'I';
		case 'I' -> 'O';
		case 'O' -> 'U';
		case 'U' -> 'A';
		default -> throw new IllegalArgumentException("Unexpected value: " + c);
		};
	}

	public static void main(String[] args) {
		ReversedStringM1 rs = new ReversedStringM1();
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp = temp + s.charAt(i);
		}
		s = "";
		Set<Character> check = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		for (int i = 0; i < temp.length(); i++) {
			if (check.contains(temp.charAt(i))) {
				s += rs.replaceVowel(temp.charAt(i));
			} else {
				s += temp.charAt(i);
			}
		}

		String f = "";
		for (int i = 0; i < s.length(); i++) {
			String t = "" + s.charAt(i);
			if (!f.contains(t)) {
				f += t;
			}
		}
		String f1="";
		for(int i=k-1;i<f.length();i++) {
			f1 += f.charAt(i);
		}
		for(int i=0;i<k-1;i++) {
			f1 += f.charAt(i);
		}
		System.out.println(f1);

		sc.close();
	}

}
