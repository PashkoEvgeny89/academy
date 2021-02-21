package by.academy.HomeWork.HW4.TestForInteger;

import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {

		Integer[] arr = new Integer[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;

		System.out.println(Arrays.toString(arr));

		System.out.println(arr[arr.length - 1] != null);

//метод добавления в конец и увеличения при необходимости размера массива
		// addToEnd()

		for (int i = 0; i <= arr.length; i++) {
			if (arr[arr.length - 1] != null) {
				Integer[] arr2 = new Integer[arr.length * 2 + 1];
				System.arraycopy(arr, 0, arr2, 0, arr.length);
				arr = arr2;
			}
			if (arr[i] == null) {
				arr[i] = 3;
				break;
			}
		}
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i <= arr.length; i++) {
			if (arr[arr.length - 1] != null) {
				Integer[] arr2 = new Integer[arr.length * 2 + 1];
				System.arraycopy(arr, 0, arr2, 0, arr.length);
				arr = arr2;
			}
			if (arr[i] == null) {
				arr[i] = 4;
				break;
			}
		}
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i <= arr.length; i++) {
			if (arr[arr.length - 1] != null) {
				Integer[] arr2 = new Integer[arr.length * 2 + 1];
				System.arraycopy(arr, 0, arr2, 0, arr.length);
				arr = arr2;
			}
			if (arr[i] == null) {
				arr[i] = 5;
				break;
			}
		}
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i <= arr.length; i++) {
			if (arr[arr.length - 1] != null) {
				Integer[] arr2 = new Integer[arr.length * 2 + 1];
				System.arraycopy(arr, 0, arr2, 0, arr.length);
				arr = arr2;
			}
			if (arr[i] == null) {
				arr[i] = 6;
				break;
			}
		}
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i <= arr.length; i++) {
			if (arr[arr.length - 1] != null) {
				Integer[] arr2 = new Integer[arr.length * 2 + 1];
				System.arraycopy(arr, 0, arr2, 0, arr.length);
				arr = arr2;
			}
			if (arr[i] == null) {
				arr[i] = 7;
				break;
			}
		}
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));

		// метод добавления в начало и увеличения при необходимости размера массива
		// addToFirst()

		
		
		
		if (arr[arr.length - 1] != null) {
			Integer[] arr2 = new Integer[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}

		for (int i = arr.length-2; i >= 0; i--) {
			if (arr[i]!=null) {
				arr[i+1]=arr[i];
			}
		}
		arr[0]=8;
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		
		
		if (arr[arr.length - 1] != null) {
			Integer[] arr2 = new Integer[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}

		for (int i = arr.length-2; i >= 0; i--) {
			if (arr[i]!=null) {
				arr[i+1]=arr[i];
			}
		}
		arr[0]=9;
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		// метод добавления индексу и увеличения при необходимости размера массива
				// addToIndex(int index=5)
		
		if (arr[arr.length - 1] != null) {
			Integer[] arr2 = new Integer[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}
		int index=5;
		for (int i = arr.length-2; i >= index; i--) {
			if (arr[i]!=null) {
				arr[i+1]=arr[i];
			}
		}
		arr[index]=10;
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
