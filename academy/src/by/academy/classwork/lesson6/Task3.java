package by.academy.classwork.lesson6;

import java.util.regex.Pattern;

public class Task3 {
	static Pattern p=Pattern.compile("\\w+@\\w+\\.\\w+");

	public static void main(String[] args) {

		// 6. Написать regexp для email.

		String s = " _123test@_123test._123test  ";

		System.out.println(validate(s));
	}

	private static boolean validate(String s) {
		s = s.trim();
	
		return p.matcher(s).matches();
	}
}
