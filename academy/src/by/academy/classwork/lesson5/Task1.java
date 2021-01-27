package by.academy.classwork.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ввести n строк с консоли, найти самую короткую и самую длинную строки.
		// Вывести найденные строки и их длину.

		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();

		String[] array = new String[n];
		sc1.nextLine();
		for (int i = 0; i < n; i++) {

			array[i] = sc1.nextLine();

		}

		System.out.println(Arrays.toString(array));
		sc1.close();
	}

}
