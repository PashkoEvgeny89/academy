package by.academy.classwork.lesson4;

public class Task12 {

	public static void main(String[] args) {
		// 12. Найти произведение двузначных нечетных чисел кратных 13.
		int pr = 1;
		for (int i = 10; i <= 99; i++) {

			if (i % 1 == 1 && i % 13 == 0) {
				pr = pr * i;
			}
			System.out.println(pr);
		}

	}

}
