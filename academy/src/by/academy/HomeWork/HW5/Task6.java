package by.academy.HomeWork.HW5;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {

		int[] array = new int[8];

		try {
			for (int i = 0; i < 10; i++) {
				array[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array is small, expand the array");
		}
		System.out.println(Arrays.toString(array));

	}

}