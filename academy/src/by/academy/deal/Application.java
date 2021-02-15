package by.academy.deal;

import java.text.ParseException;

public class Application {

	public static void main(String[] args) throws ParseException {

	
	//	Person seller = new Person();
	//	seller.createPerson();
		
	//	Person buyer = new Person();
	//	buyer.createPerson();
		
		Person seller = new Person("Evgeny", 100.0 , "+375295673108", "ev.pahko89@gmail.com");
		Person buyer = new Person("Andrey", 650.0, "+375295042335", "Andrey-email@mail.ru");
		
		Deal deal = new Deal("16-02-2021", seller, buyer);

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
	
