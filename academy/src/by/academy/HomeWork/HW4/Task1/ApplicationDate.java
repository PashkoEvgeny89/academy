package by.academy.HomeWork.HW4.Task1;

public class ApplicationDate {

	    public static void main(String[] args) {
	        Date date1 = new Date("11-07-1989");
	        Date date2 = new Date("28-02-2021");
	        date2.setDate("01-03-2021");
	        System.out.println(date1.getDay());
	        System.out.println(date2.getDayOfWeek());
	        System.out.println(date1.getDaysBetweenTwoDates(date2));
	        System.out.println(date1.isLeapYear());
	    }
	}
