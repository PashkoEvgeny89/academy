package by.academy.HomeWork.HW2;

public class Task1 {

	public static void main(String[] args) {
		
		int n=17810393;
		int sec;
		int min;
		int hour;
		int day;
		int month;
		int year;
		
		sec=n%60;
		int p;
		p=(n-sec)/60;
		min=p%60;
		p=(p-min)/60;
		hour=p%24;
		p=(p-hour)/24;
		day=p%30;
		p=(p-day)/30;
		month=p%12;
		year=p-month;
		
		System.out.println(" year:"+year+" month:"+month+" day:"+day+" hour:"+hour+" min:"+min+" sec:"+sec);
		int proverka;
		proverka=sec+min*60+hour*60*60+day*60*60*24+month*60*60*24*30+year*60*60*24*30*12;
		System.out.println(proverka);

	}
}
