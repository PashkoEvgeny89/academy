package by.academy.HomeWork.HW6.Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {

	public static final String INPUT_FILE_PATH = "src\\by\\academy\\HomeWork\\HW6\\Task2\\fileTask2.txt";
	public static final String OUTPUT_FILE_PATH = "src\\by\\academy\\HomeWork\\HW6\\Task2\\result.txt";

	public static void main(String[] args) {

		try (FileInputStream fileIn = new FileInputStream(new File(INPUT_FILE_PATH));
				FileOutputStream fileOut = new FileOutputStream(new File(OUTPUT_FILE_PATH))) {

			int a;
			while ((a = fileIn.read()) != -1) {

				if (a != 32) { // 32 character " "
					fileOut.write(a);
				}
			}
		} catch (IOException message) {
			message.getStackTrace();
		}
	}
}
