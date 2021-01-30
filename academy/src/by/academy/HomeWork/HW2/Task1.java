package by.academy.HomeWork.HW2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 lines:");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();

		StringBuffer str11 = new StringBuffer(str1);
		StringBuffer str22 = new StringBuffer(str2);

		if (str1.length() == str2.length()) {
			
			// delete the same characters in two lines

			for (int i = 0; i < str1.length(); i++) {
				for (int q = 0; q < str11.length(); q++) {
					if (str11.charAt(0) == str22.charAt(q)) {
						str11 = str11.deleteCharAt(0);
						str22 = str22.deleteCharAt(q);
					}
				}
				
				// int[] array=new int[256];
				
			}
		}

		if (str11.length() == 0) {
			System.out.println("true");
		}

		else {
			System.out.println("false");
		}
	}
}
