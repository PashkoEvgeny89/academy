package by.academy.classwork.lesson17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileRead {

	public static void main(String[] args) {
		try {

			InputStream input = new FileInputStream("src\\by\\academy\\classwork\\lesson17\\file17copy.txt");
			int size = input.available();

			for (int i = 0; i < size; i++) {
				// Чтение текстового файла посимвольно
				System.out.print((char) input.read());
			}
			input.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}
