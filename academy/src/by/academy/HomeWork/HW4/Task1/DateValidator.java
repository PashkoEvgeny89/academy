package by.academy.HomeWork.HW4.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator {

	private static final Pattern PATTERN = Pattern
			.compile("((([0-2]\\d)|(30)|(31))\\-((0\\d)|(1[0-2]))\\-((19|20)\\d\\d))");

	@Override
	public boolean validate(String strDate) {
		Matcher matcher = PATTERN.matcher(strDate);
		return matcher.matches();
	}
}
