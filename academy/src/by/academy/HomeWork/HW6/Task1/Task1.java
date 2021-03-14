package by.academy.HomeWork.HW6.Task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static final String FILE_PATH = "src\\by\\academy\\HomeWork\\HW6\\Task1\\fileTask1.txt";

	public static void main(String[] args) {
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {

			String text;
			while (!"stop".equals(text = bufferedReader.readLine())) {
				bufferedWriter.write(text);
				bufferedWriter.newLine();
			}

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}