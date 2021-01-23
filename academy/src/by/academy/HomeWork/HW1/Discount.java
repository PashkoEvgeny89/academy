package by.academy.HomeWork.HW1;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {

		System.out.println("Discount");

		double summa;
		int vozrast;
		double itogo = 0;

		try (Scanner input = new Scanner(System.in)) {
			System.out.print("summa pokupok v magazine: ");
			summa = input.nextDouble();
			System.out.print("vozrast pokupatelja: ");
			vozrast = input.nextInt();
		}
		if (summa < 100) {
			itogo = summa - summa * 5 / 100;
		}

		if (summa >= 100 && summa < 200) {
			itogo = summa - summa * 7 / 100;
		}

		if (summa >= 200 && summa < 300) {

			if (vozrast > 18) {
				itogo = summa - summa * 16 / 100;
			} else
				itogo = summa - summa * 9 / 100;
		}

		if (summa >= 300 && summa < 400) {
			itogo = summa - summa * 15 / 100;
		}

		if (summa >= 400) {
			itogo = summa - summa * 20 / 100;
		}

		System.out.print("itogo c uchetom skidki:" + itogo);

	}

}
