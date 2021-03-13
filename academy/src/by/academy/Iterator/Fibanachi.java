package by.academy.Iterator;

public class Fibanachi {

	public void fib(int n) {
		long a = 0;
		long[] array = new long[n + 1];
		array[0] = 0;
		array[1] = 1;

		for (int i = 2; i <= n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}

		for (int i = 0; i < array.length; i++) {
			a = a + array[i];
			System.out.println(i + " chislo = " + (long)array[i]);
		}
	}

	public static void main(String[] args) {

		Fibanachi f = new Fibanachi();
		f.fib(100);

	}

}
