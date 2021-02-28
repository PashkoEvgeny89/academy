package by.academy.HomeWork.HW4.Task3;

public class AppIteratorArray2 {

	public static void main(String[] args) {

		Integer[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		IteratorArray2<Integer> iterator = new IteratorArray2<>(array);

		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
}
