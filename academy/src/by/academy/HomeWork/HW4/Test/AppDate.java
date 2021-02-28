package by.academy.HomeWork.HW4.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class AppDate {

	public static void main(String[] args) throws ParseException {

		//  количество дней, в заданном временном промежутке.

		/*
		 * String d1 = "00.02.2021"; SimpleDateFormat format = new
		 * SimpleDateFormat("dd.MM.yyyy"); Date date1 = null; Date date2 = new Date();
		 * 
		 * date1 = format.parse(d1);
		 * 
		 * long difference = date2.getTime() - date1.getTime(); long days = difference /
		 * (24 * 60 * 60 * 1000); System.out.println("days=" + days);
		 * 
		 */

		/* метод, который проверяет высокосный ли год или нет. / */

		int year = 2021;

		/*
		 * public boolean isLeapYear(int year) {
		 * 
		 * if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) { return
		 * true; } else { return false; } }
		 */

		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(true);
		} else
			System.out.println(false);

	}
}