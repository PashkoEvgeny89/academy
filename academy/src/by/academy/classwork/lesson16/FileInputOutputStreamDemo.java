package by.academy.classwork.lesson16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStreamDemo {

	public static void main(String[] args) {
		try {
			char[] symbols = { 'a', 'b', 'c' };
			OutputStream output = new FileOutputStream("a.txt");
			for (int i = 0; i < symbols.length; i++) {
				// Запись каждого символа в текстовый файл
				output.write(symbols[i]);
			}
			output.close();

			InputStream input = new FileInputStream("a.txt");
			int size = input.available();

			for (int i = 0; i < size; i++) {
				// Чтение текстового файла посимвольно
				System.out.print((char) input.read() + " ");
			}
			input.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}
