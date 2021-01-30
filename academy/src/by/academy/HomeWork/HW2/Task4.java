package by.academy.HomeWork.HW2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		System.out.print("How many players?: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		ArrayList<String> koloda = new ArrayList<String>();

		String[] masti = { "_chervi", "_bubna", "_trevi", "_piki" };
		String[] big = { "V", "D", "K", "T" };
		for (int q = 0; q < masti.length; q++) {
			for (int i = 2; i <= 10; i++) {
				koloda.add(i + masti[q]);
			}
			for (int k = 0; k < big.length; k++) {
				koloda.add(big[k] + masti[q]);
			}

		}

		String[][] igroki = new String[n][5];

		Random rand = new Random();
		for (int q = 0; q < n; q++) {
		
			for (int i = 0; i < 5; i++) {

				igroki[q][i] = koloda.get(rand.nextInt(koloda.size() + 1));
				System.out.print(igroki[q][i] + "  ");
				koloda.remove(igroki[q][i]);
			}
			System.out.println();
			System.out.println();
		}

	}

}
