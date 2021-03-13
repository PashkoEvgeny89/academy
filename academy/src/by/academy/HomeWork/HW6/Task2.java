package by.academy.HomeWork.HW6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {

	public static final String INPUT_FILE_PATH = "src\\by\\academy\\HomeWork\\HW6\\fileTask2.txt";
	public static final String OUTPUT_FILE_PATH = "src\\by\\academy\\HomeWork\\HW6\\result.txt";

	public static void main(String[] args) throws IOException {

		File inputFile = new File(INPUT_FILE_PATH);

		File outputFile = new File(OUTPUT_FILE_PATH);
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}

		try (FileInputStream fileIn = new FileInputStream(inputFile);
				FileOutputStream fileOut = new FileOutputStream(outputFile)) {
			int a;
			while ((a = fileIn.read()) != -1) {

				if (a != 32) { // 32 character " "
					fileOut.write(a);
				}
			}
		}
	}
}
