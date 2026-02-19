package Feb_18_Prac;

import java.io.*;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) {
		File obj = new File("trial.txt");
		try {
			if (obj.createNewFile()) {
				System.out.println("File created: " + obj.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileWriter wr = new FileWriter(obj);
			wr.write("This is trial demo of file handling\n");
			wr.write("This is second line of file handling");
			wr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			Scanner fr = new Scanner(obj);
			while (fr.hasNextLine()) {
				String l = fr.nextLine();
				System.out.println(l);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			if (obj.delete()) {
				System.out.println("File deleted");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
