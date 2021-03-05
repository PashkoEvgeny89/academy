package by.academy.HomeWork.HW5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {

	private static Random random = new Random();

	public void add(List<Integer> list) {

		for (int i = 0; i <= 1_000_00; i++) {
			list.add(random.nextInt());
		}
	}

	public long remove(List<Integer> list) {

		long startTime = System.nanoTime();
		for (int i = 0; i <= 100_00; i++) {
			list.remove(random.nextInt(list.size()));
		}
		long finishTime = System.nanoTime();
		return finishTime - startTime;
	}

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		Task2 taskArrayList = new Task2();
		Task2 taskLinkedList = new Task2();

		taskArrayList.add(arrayList);
		taskLinkedList.add(linkedList);

		System.out.println("Time for ArrayList= " + taskArrayList.remove(arrayList));
		System.out.println("Time for LinkedList= " + taskLinkedList.remove(linkedList));
		System.out.println("Time difference between ArrayList/LinkedList = "
				+ taskLinkedList.remove(linkedList) / taskArrayList.remove(arrayList));

	}

}
