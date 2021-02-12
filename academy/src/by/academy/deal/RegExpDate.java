package by.academy.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDate {

//	public static void main(String... args) throws ParseException {

		
		RegExpDate(){
			super();
		}

		public void regExpDate(String date) throws ParseException {
			System.out.println("\nDate of the transaction:");
		SimpleDateFormat df = new SimpleDateFormat("'Day: '<dd> \n'Month: '<MM>' \nYear: '<yyyy>");
		Date dateDeal = new Date();

		Pattern pattern1 = Pattern.compile("((([0-2]\\d)|(30)|(31))\\-((0\\d)|(1[0-2]))\\-((19|20)\\d\\d))");
		Matcher matcher1 = pattern1.matcher(date);

		if (matcher1.matches()) {
			SimpleDateFormat df1 = new SimpleDateFormat("dd-MM-yyyy");
			dateDeal = df1.parse(date);
			System.out.println(df.format(dateDeal.getTime()));
		} else {
			Pattern pattern2 = Pattern.compile("((([0-2]\\d)|(30)|(31))\\/((0\\d)|(1[0-2]))\\/((19|20)\\d\\d))");
			Matcher matcher2 = pattern2.matcher(date);

		if (matcher2.matches()) {
			SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
			dateDeal = df1.parse(date);
			System.out.println(df.format(dateDeal.getTime()));
		} else {
			System.out.println("The date format is not suitable for output");
		}

	}
	}
}
