package by.academy.HomeWork.HW2;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {

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

		HashMap<Integer, String> lengthword = new HashMap<>();
		for (int i = array.length - 1; i >= 0; i--) {
			StringBuffer word = new StringBuffer(array[i]);

			// removing duplicate characters from a word
			for (int q = 0; q < word.length(); q++) {
				int max = word.length();
				for (int p = q + 1; p < max; max--) {
					if (word.charAt(q) == word.charAt(max - 1)) {
						word = word.deleteCharAt(max - 1);
					}
				}
			}
			// saving the number (Key) of different characters in a word and its meaning (Value)
			lengthword.put(word.length(), array[i]);
		}
		System.out.println("The first word in which the number of different characters is minimal: "
				+ lengthword.get(lengthword.keySet().toArray()[0]));
		sc.close();
		System.out.println(lengthword);
	}
}
