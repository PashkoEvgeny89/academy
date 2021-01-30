package by.academy.HomeWork.HW2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 words consisting of an even number of letters:");
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		sc.close();

		if (word1.length() % 2 == 1 || word2.length() % 2 == 1) {
			System.out.println("Error!!! You entered it incorrectly!");
		} else {
			word1 = word1.substring(0, word1.length() / 2);
			word2 = word2.substring(word2.length() / 2, word2.length());
			String word12 = word1 + word2;
			System.out.println(word12);
		}
	}
}
