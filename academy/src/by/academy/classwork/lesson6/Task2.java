package by.academy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args) {
		String str = " Hey      There!     How      Are you doing";
		
	//	 оставить лишь 1 пробел между слов.
        
	
      
        System.out.print(str.replaceAll("\\s+", " ").trim());

       
        
      
	}
}
