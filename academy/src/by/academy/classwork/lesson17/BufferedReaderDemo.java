package by.academy.classwork.lesson17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("src\\by\\academy\\classwork\\lesson17\\buffWriter.txt"))) {
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
