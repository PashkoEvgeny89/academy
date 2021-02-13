package by.academy.classwork.lesson10;

public class Application {

	public static void main(String[] args) {
		DayOfWeek dayofweek=DayOfWeek.Monday;
		
		for (DayOfWeek c: DayOfWeek.values()) {
			System.out.println(c+" "+c.getDayNumber());
		}

		switch (dayofweek) {
		case Monday:
			System.out.println("Today Monday "+dayofweek.getDayNumber());
			break;
		case Tuesday:
			System.out.println("Today Tuesday ");
			break;
		case Wednesday:
			System.out.println("Today Wednesday ");
			break;
		case Thursday:
			System.out.println("Today Thursday ");
			break;
		case Friday:
			System.out.println("Today Friday ");
			break;
		case Saturday:
			System.out.println("Today Saturday ");
			break;
		case Sunday:
			System.out.println("Today Sunday ");
			break;  
		}
	}

}
