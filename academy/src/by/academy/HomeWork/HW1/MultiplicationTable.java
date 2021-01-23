package by.academy.HomeWork.HW1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		int number;

		Scanner input = new Scanner(System.in);
		System.out.print("Multiplication Table: ");
		number = input.nextInt();
		input.close();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + number + " = " + i * number);
		}

	}

}
