package by.academy.HomeWork.HW6.Task4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {
	
	public static final String FILES_PATH = "src/by/academy/HomeWork/HW6/Task4/txt100";
	public static final String OUTPUT_FILE_PATH = "src\\by\\academy\\HomeWork\\HW6\\Task4\\result.txt";
	public static final String INPUT_FILE_PATH = "src\\by\\academy\\HomeWork\\HW6\\Task2\\fileTask2.txt";
	public static final Random random = new Random();
	public static final int QUANTITY_FILES=100;

	public static void main(String[] args) {
		
		File dir = new File(FILES_PATH);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		
		StringBuilder sb = new StringBuilder();
		
		try (FileReader reader = new FileReader(INPUT_FILE_PATH)) {
			int text;
			while ((text = reader.read()) != -1) {
				sb.append((char) text);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= QUANTITY_FILES; i++) {
		
			File file = new File(dir, i + ".txt");
			try (FileWriter writer = new FileWriter(file)) {
				file.createNewFile();
				writer.write(sb.substring(0, random.nextInt(sb.length() + 1)));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileWriter writer = new FileWriter(new File(OUTPUT_FILE_PATH))) {
			for (File file : dir.listFiles()) {
				
				writer.append(file.getName() + " " + file.length() + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}