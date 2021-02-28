package by.academy.HomeWork.HW4.Task1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
	private Year year;
	private Month month;
	private Day day;
	private final DateValidator dateVal = new DateValidator();

	public Date() {
		super();
	}

	public Date(String date) {
		super();
		validateDate(date);
	}

	public void setDate(String date) {
		validateDate(date);
	}

	private static class Year {
		private final int year;

		Year(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}
	}

	public int getYear() {
		return year.getYear();
	}

	public int getMonth() {
		return month.getMonth();
	}

	public int getDay() {
		return day.getDay();
	}

	private static class Month {
		private final int month;

		private Month(int month) {
			this.month = month;
		}

		public int getMonth() {
			return month;
		}
	}

	private static class Day {
		private final int day;

		private Day(int day) {
			this.day = day;
		}

		private int getDay() {
			return day;
		}
	}

	private void validateDate(String date) {
		if (dateVal.validate(date)) {
			this.year = new Year(Integer.parseInt(date.substring(6, 10)));
			this.month = new Month(Integer.parseInt(date.substring(3, 5)));
			this.day = new Day(Integer.parseInt(date.substring(0, 2)));
		} else {
			System.out.println("Enter the date in the format: dd-mm-yyyy");
		}
	}

	public DayOfWeek getDayOfWeek() {
		LocalDate localDate = LocalDate.of(getYear(), getMonth(), getDay());
		return DayOfWeek.fromValue(localDate.getDayOfWeek().getValue());
	}

	public long getDaysBetweenTwoDates(Date date) {
		LocalDate dateBefore = LocalDate.of(getYear(), getMonth(), getDay());
		LocalDate dateAfter = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
		return Math.abs(ChronoUnit.DAYS.between(dateBefore, dateAfter));

	}

	public boolean isLeapYear() {
		if ((getYear() % 400 == 0) || ((getYear() % 4 == 0) && (getYear() % 100 != 0))) {
			return true;
		} else {
			return false;
		}
	}
}
