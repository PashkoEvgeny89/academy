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

		ArrayList<String> deck = new ArrayList<String>();
		String[] masti = { "_chervi", "_bubna", "_trevi", "_piki" };
		String[] big = { "V", "D", "K", "T" };
		for (int q = 0; q < masti.length; q++) {
			for (int i = 2; i <= 10; i++) {
				deck.add(i + masti[q]);
			}
			for (int k = 0; k < big.length; k++) {
				deck.add(big[k] + masti[q]);
			}
		}
		int s = 5; // the number of cards each player has
		if (n > deck.size() / s) {
			System.out.println("Too many players! MAX 10. Go play MAFIA");
		} else {
			String[][] player = new String[n][s];
			Random rand = new Random();
			for (int q = 0; q < n; q++) {
				for (int i = 0; i < s; i++) {
					player[q][i] = deck.get(rand.nextInt(deck.size()));
					System.out.print(player[q][i] + "  ");
					deck.remove(player[q][i]);
				}
				System.out.println();
				System.out.println();
			}
		}
	}
}
