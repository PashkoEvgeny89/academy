package by.academy.HomeWork.HW6.Task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {

//	public static final String INPUT_FILE_PATH = "src\\by\\academy\\classwork\\lesson17\\file17.txt";
//	public static final String OUTPUT_FILE_PATH = "src\\by\\academy\\classwork\\lesson17\\file17copy.txt";
//
	public static void main(String[] args) throws IOException {
		File dir = new File("src/by/academy/HomeWork/HW6/Task3/Users");

		if (!dir.exists()) {
			dir.mkdirs();
		}
//
//		File inputFile = new File(INPUT_FILE_PATH);
//		if (!inputFile.exists()) {
//			inputFile.createNewFile();
//		}
//
//		File outputFile = new File(OUTPUT_FILE_PATH);
//		if (!outputFile.exists()) {
//			outputFile.createNewFile();
//		}
//
//		try (FileInputStream fileIn = new FileInputStream(inputFile);
//				FileOutputStream fileOut = new FileOutputStream(outputFile)) {
//			int a;
//			while ((a = fileIn.read()) != -1) {
//				if (a==63) {
//					a=33;
//				}
//				if (a==32) {
//					a=33;
//				}
//				fileOut.write(a);
//			}
//		}
	}
}
