package by.academy.Iterator;

public class Fibanachi {

	public void fib(int n) {
		
		long[] array = new long[n + 1];
		array[0] = 0;
		array[1] = 1;

		for (int i = 2; i <= n; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		System.out.println(array[array.length-1]);
		
	}

	public void fib2(int n) {
		long fib1 = 0;
		long fib2 = 1;
		for (int i = 2; i <= n; i++) {
			long next = fib1 + fib2;
			fib1 = fib2;
			fib2 = next;
		}
		System.out.println(fib2);
	}

	public static void main(String[] args) {

		Fibanachi f = new Fibanachi();
		f.fib(10);
		f.fib2(10);

	}

}
