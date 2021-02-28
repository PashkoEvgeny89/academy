package by.academy.HomeWork.HW4.Test;

public class DateTest {

	//LocalDate
	
		//Calendar calendar = new GregorianCalendar(2017, 0 , 25);
		
		private DateTest date;  //dd-mm-yyyy
		
		/* 
		Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
	Методы: задать дату, вывести на консоль день недели по заданной дате. 
	День недели представить в виде перечисления. Пишем свой ином

	Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
	После валидации в конструкторе создаем объекты класса Year, Month, Day.


		
		
		 

		if Validate true ->
		Year  parse (4 dig)
		Month  parse (2 big)
		Day   parse (2 dig)     */
		
		
		public DateTest getDate() {
			return date;
		}

		
		public void setDate1(DateTest date) {
			this.date = date;
		}
		
		public void printDate(DateTest date) {
			System.out.println("Day of week=");
			
		}
		
		
		
			//Calendar calendar = new GregorianCalendar(new Date);
			
		

			
		
		
			
		//int getDayOfYear();         ���������� ����� ��� � ������ ����

			
		
		//	calendar.set(Calendar.YEAR, 2017); 			class Year parse date YEAR
		//	calendar.set(Calendar.MONTH, 0);			class Month parse date MONTH
		//	calendar.set(Calendar.DAY_OF_MONTH, 25);	class Day parse date DAY_OF_MONTH
			
			
		
		
		
	}

