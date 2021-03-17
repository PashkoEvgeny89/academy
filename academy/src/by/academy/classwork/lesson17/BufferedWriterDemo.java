package by.academy.classwork.lesson17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		try (BufferedWriter bufferedWriter = new BufferedWriter(
				new FileWriter("src\\by\\academy\\classwork\\lesson17\\buffWriter.txt"))) {
			String text = "Приветhkhghjk мир!";
			bufferedWriter.write(text);
			bufferedWriter.newLine();
			bufferedWriter.write(text);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}