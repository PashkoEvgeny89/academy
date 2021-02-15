package by.academy.deal;

import java.text.ParseException;

public class Application {

	public static void main(String[] args) throws ParseException {
		
	//	Person seller = new Person("Evgeny", 1000.0 , "+375295673108", "ev.pashko89@gmail.com");
	//	Person buyer = new Person("Andrey", 50.0, "+375295042335", "Andrey-email@mail.ru");

		Person seller = new Person();
		seller.createPerson();
		
		Person buyer = new Person();
		buyer.createPerson();
		
		
		Deal deal = new Deal("21-11-2020", seller, buyer);

		deal.addProduct(new Cheese("Cheese", 25.7, "Itali", 2, 21));
		deal.addProduct(new Wine("Wine", 24.5, "Sacebeli", 7, "Georgia"));
		deal.addProduct(new Milk("Milk", 1.7, "Prostokvashino", 21, 1.5));

		
		deal.deal();
		
		deal.deadline(); // Task 7
		
		RegExpDate red=new RegExpDate();  //Task 3, Task 4
		red.regExpDate(deal.getDate());
	
		BelarusPhoneValidator q=new BelarusPhoneValidator();  //Task 5, Task 9
		System.out.println("\n"+q.validate(deal.getBuyer().getPhone()));
		
	}
}
	
