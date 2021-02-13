package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	private Pattern pattern = Pattern.compile("(\\w+[\\.-_]?\\w+)*@([a-z]{2,6}\\.{1}[a-z]{2,5})");
	
	@Override
	public boolean validate(String str) {
			
			Matcher matcher = pattern.matcher(str);
			return matcher.matches();
		}


	
}
