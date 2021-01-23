package by.academy.HomeWork.HW1;

import java.util.Locale;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		String type;

		Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);
		System.out.print("The type of the variable: ");
		type = input.nextLine();

		switch (type) {

		case ("int"):
			System.out.print("The value of the variable: ");
			int a = input.nextInt();
			System.out.println("Ostatok ot delenija na 2: " + a % 2);
			break;

		case ("double"):
			System.out.print("The value of the variable: ");
			double d = input.nextDouble();
			System.out.println("70% ot chisla: " + d * 0.7);
			break;

		case ("float"):
			System.out.print("The value of the variable: ");
			float f = input.nextFloat();
			System.out.println("znachenie v stepeni 2: " + f * f);
			break;

		case ("char"):
			System.out.print("The value of the variable: ");
			char ch = input.next().charAt(0);
			System.out.println("Kod simvola " + "'" + ch + "'" + ": " + (int) ch);
			break;

		case ("String"):
			System.out.print("The value of the variable: ");
			String s = input.nextLine();
			System.out.println("Hello " + s);
			break;

		default:
			System.out.println("Unsupported type  ");

		}

		input.close();

	}

}
