package by.academy.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		String[] array1 = { "мама", "мыла", "раму" };
		String[] array2 = { "я", "очень", "люблю", "java" };
		String[] array3 = { "мир", "труд", "май" };

		List<String[]> arrays = new ArrayList<>();
		arrays.add(array1);
		arrays.add(array2);
		arrays.add(array3);



		arrays.sort((o1, o2) -> o2.length - o1.length);

		for (String[] a : arrays) {
			System.out.println(Arrays.toString(a));
		}
		
		   
		
		   
	}
}