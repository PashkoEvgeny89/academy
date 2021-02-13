package by.academy.deal;

public class Wine extends Product {
	
	String color;
	String country;
	
	public Wine(String type, double price, String manufacturer, int quantity, String country) {
		super(type, price, manufacturer, quantity);
		this.country = country;
	}
	
	Wine(){
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public double discount() {
		if (country.equals("Georgia")) {
			return 0.83;
		} else {
			return 1;
		}
	}
	
	

}