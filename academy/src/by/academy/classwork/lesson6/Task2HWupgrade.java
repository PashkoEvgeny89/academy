package by.academy.classwork.lesson6;

import java.util.HashMap;
import java.util.Scanner;

public class Task2HWupgrade {

	static void RemovingDuplicateCharacters(HashMap<Integer, String> abc, String s) {

		StringBuffer word = new StringBuffer(s);
		
		for (int q = 0; q < word.length(); q++) {
			for (int p = q + 1; p < word.length(); p++)
				if (word.charAt(q) == word.charAt(p)) {
					word = word.deleteCharAt(p);
				}
		}
		abc.put(word.length(), s); 	// saving the number (Key) of different characters in a word 
									// and its meaning (Value)
	}

	public static void main(String[] args) {

		System.out.print("How many words do you want to enter?: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter " + n + " words: ");

		String[] array = new String[n];
		sc.nextLine();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLine();
		}
		sc.close();

		HashMap<Integer, String> lengthword = new HashMap<>();

		for (int i = array.length - 1; i >= 0; i--) {
			RemovingDuplicateCharacters(lengthword, array[i]);
		}
		System.out.println("The first word in which the number of different characters is minimal: "
				+ lengthword.get(lengthword.keySet().toArray()[0]));
	}
}
