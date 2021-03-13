package by.academy.HomeWork.HW6.Task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

		public static void main(String[] args) {
			try (BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter("src\\by\\academy\\HomeWork\\HW6\\Task1\\fileTask1.txt"))) {
				
				
				
				String text = "stop1";
				// писать код
				
				
				
				
				bufferedWriter.write(text);
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}


//Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл, 
//если введена "stop" строка тогда закончить запись в файл.