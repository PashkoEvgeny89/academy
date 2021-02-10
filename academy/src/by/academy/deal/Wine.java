package by.academy.deal;

public class Wine extends Product {

	private String country;
	String color;

	public Wine(Double price, String name, String manufacture, Integer quantity, String country) {
		super(name, price, manufacture, quantity);
		this.country = country;
	}

	Wine() {
		super();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void drink() {
		System.out.println("drink");
	}

	void pay() {
		System.out.println("pay");

	}

	@Override
	public void discount(String country) {

		if (country.equals("Georgia")) {
			price = price * 0.8;
		}
	}

}
