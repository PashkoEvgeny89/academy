package by.academy.HomeWork.HW1;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		String type;

		Scanner input = new Scanner(System.in).useLocale(Locale.ENGLISH);

		// .useLocale(Locale.ENGLISH) - kak ot etogo izbavitsj??????????

		System.out.print("The type of the variable: ");
		type = input.nextLine();
 
boolean t = Objects.equals(type, "int") || Objects.equals(type, "String") || Objects.equals(type, "double")
				|| Objects.equals(type, "float") || Objects.equals(type, "char");

		if (t) {

			System.out.print("The value of the variable: ");

			switch (type) {

			case ("int"):
				int a = input.nextInt();
				System.out.println("Ostatok ot delenija na 2: " + a % 2);
				break;

			case ("double"):
				double d = input.nextDouble();
				System.out.println("70% ot chisla: " + d * 0.7);
				break;

			case ("float"):
				float f = input.nextFloat();
				System.out.println("znachenie v stepeni 2: " + f * f);
				break;

			case ("char"):
				char ch = input.next().charAt(0);
				System.out.println("Kod simvola " + "'" + ch + "'" + ": " + (int) ch);
				break;

			case ("String"):
				String s = input.nextLine();
				System.out.println("Hello " + s);
				break;
			}

		} else {
			System.out.println("Unsupported type  ");
			
		}

		input.close();

	}

}
