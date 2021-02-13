package by.academy.classwork.lesson10;

public enum DayOfWeek {
	Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6), Sunday(7);
	
	private int dayNumber;
	
	DayOfWeek(int dayNumber) {
		this.dayNumber=dayNumber;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	
	
}
