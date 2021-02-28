package by.academy.classwork.lesson13;

public class TestIterator {

	public static void main(String[] args) {

		Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	

		ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(array);

		while (arrayIterator.hasNext()) {
			Integer i = arrayIterator.next();

			System.out.println(i);
		}

	}

}
