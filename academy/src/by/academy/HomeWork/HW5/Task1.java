package by.academy.HomeWork.HW5;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {

	public ArrayList<Integer> deleteDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int q = i + 1; q < list.size(); q++) {
				if (list.get(i).equals(list.get(q))) {
					list.remove(q);
					q--;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i <= 10; i++) {
			list.add(random.nextInt(5));
		}

		System.out.println(list);

		Task1 task1 = new Task1();

		task1.deleteDuplicate(list);

		System.out.println(list);

	}
}