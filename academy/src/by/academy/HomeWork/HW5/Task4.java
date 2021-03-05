package by.academy.HomeWork.HW5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task4 {

	Random random = new Random();

	public void add(ArrayList<Integer> list) {

		for (int i = 0; i <= 25; i++) {
			list.add(random.nextInt(10));
		}
	}

	public Integer bestScore(ArrayList<Integer> list) {
		int bestScore = 0;
		for (Integer score : list) {
			if (score > bestScore) {
				bestScore = score;
			}
		}
		return bestScore;
	}

	public Integer bestScoreIterator(ArrayList<Integer> list) {
		Integer bestScore = 0;
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext()) {
			Integer score = iterator.next();
			if (score > bestScore) {
				bestScore = score;
			}
		}
		return bestScore;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		Task4 task4 = new Task4();
		task4.add(list);
		System.out.println(list);

		System.out.println(task4.bestScore(list));
		System.out.println(task4.bestScoreIterator(list));

	}

}
