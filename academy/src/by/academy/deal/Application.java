package by.academy.deal;

import java.text.ParseException;

public class Application {

	//	public final static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) throws ParseException {
			
			Person seller = new Person("Evgeny", 100.0, "+375295673108", "ev.pahko89@gmail.com", "11-07-1989");
			Person buyer = new Person("Andrey", 650.0, "+375295042335", "Andrey-email@mail.ru", "01/08/1986");

			Deal deal = new Deal("16-02-2021", seller, buyer);

			deal.addProduct(new Cheese("Cheese", 25.7, "ItalianoCheese", 2, 21));
			deal.addProduct(new Wine("Wine", 24.5, "Sacebeli", 7, "Georgia"));
			deal.addProduct(new Milk("Milk", 1.7, "Prostokvashino", 21, 1.5));

			deal.printProducts();
			
			deal.deleteProduct("Wine");
			
			deal.printProducts();
			
			deal.printBill();
			
			deal.deal();

			deal.deadline(); // Task 7

			RegExpDate regExp = new RegExpDate(); // Task 3, Task 4, Task 6
			regExp.regExpDate(deal.getDate());
		

			BelarusPhoneValidator phone = new BelarusPhoneValidator(); // Task 5, Task 9
			System.out.println("\nValidate for phone: " + phone.validate(deal.getBuyer().getPhone()));

			EmailValidator email = new EmailValidator();
			System.out.println("Validate for email: " + email.validate(deal.getSeller().getEmail()));
		}
	}