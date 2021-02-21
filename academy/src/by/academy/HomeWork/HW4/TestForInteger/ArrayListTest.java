package by.academy.HomeWork.HW4.TestForInteger;

import java.util.Arrays;

public class ArrayListTest {

	public static void main(String[] args) {

		Integer[] arr = new Integer[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;

		System.out.println(Arrays.toString(arr));

		// добавления в наш массив объекта типа T - add(T obj)
//1.1 метод добавления в конец и увеличения при необходимости размера массива
		// addElementToLast()
		int valueElementLast = 3;

		if (arr[arr.length - 1] != null) {
			Integer[] arr2 = new Integer[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = valueElementLast;
				break;
			}
		}
		System.out.println(Arrays.toString(arr));

		// 1.2 метод добавления в начало и увеличения при необходимости размера массива
		// addElementToFirst()

		int valueElementFirst = 4;
		if (arr[arr.length - 1] != null) {
			Integer[] arr2 = new Integer[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != null) {
				arr[i + 1] = arr[i];
			}
		}
		arr[0] = valueElementFirst;

		System.out.println(Arrays.toString(arr));

		// 1.3 метод добавления по индексу и увеличения при необходимости размера
		// массива
		// addElementByIndex(int index=4)
		int valueElementIndex = 5;
		int indexValueElementIndex = 4;
		if (arr[arr.length - 1] != null) {
			Integer[] arr2 = new Integer[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}
		int index = indexValueElementIndex;
		for (int i = arr.length - 2; i >= index; i--) {
			if (arr[i] != null) {
				arr[i + 1] = arr[i];
			}
		}
		arr[index] = valueElementIndex;

		System.out.println(Arrays.toString(arr));

		// 2 Взятие лемента по индексу
		// getElemenByIndex(int index)
		index = 3;
		int a = arr[index];
		System.out.println(a);

		// 3 взятие последнего элемента getLastElement()
		int elemetLast = 0;
		for (int i = arr.length - 1; i >= index; i--) {

			if (arr[i] != null) {
				elemetLast = arr[i];
				break;
			}
		}
		System.out.println(elemetLast);

		// 4 взятие первого элемента getFirstElement()
		int elementFirst = arr[0];
		System.out.println(elementFirst);

		// 5 вывод размера массива
		// outputSize()
		int sizeArray = arr.length;
		System.out.println(sizeArray);

		// 6 вывод индекса последнего заполненого элемента (не путать с размерностью)
		// getLastIndex!=null()

		int lastIndex = 0;
		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] != null) {
				lastIndex = i;
				break;
			}
		}
		System.out.println(lastIndex);

		// 7 удаление элемента по индексу removeElementByIndex(int i)
		// нужно исрользовать 6 задание lastIndex

		int lastIndex1 = 0;
		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] != null) {
				lastIndex1 = i;
				break;
			}
		}

		int removeElemen = 3;
		for (int i = removeElemen; i < lastIndex1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[lastIndex1] = null;
		System.out.println(Arrays.toString(arr));

		// 8 удаление элемента по значению removeElementByValue(T obj)
		// нужно исрользовать 6 задание lastIndex

		int lastIndex2 = 0;
		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] != null) {
				lastIndex2 = i;
				break;
			}
		}

		int removeElementValue = 3;
		int removeIndex = 0;
		for (int i = 0; i <= lastIndex2; i++) {
			if (arr[i] == removeElementValue) { // нужно будет применить сравнение объектов
				removeIndex = i;
				for (int q = removeIndex; q < lastIndex2; q++) {
					arr[q] = arr[q + 1];
				}
				arr[lastIndex2] = null;
				break;
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
