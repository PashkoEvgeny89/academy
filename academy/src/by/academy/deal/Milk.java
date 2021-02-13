package by.academy.deal;

public class Milk extends Product {

	double percentFat;

	public Milk(String type, double price, String manufacturer, int quantity, double percentFat) {
		super(type, price, manufacturer, quantity);
		this.percentFat = percentFat;
	}

	Milk() {
		super();
	}

	public double getPercentFat() {
		return percentFat;
	}

	public void setPercentFat(double percentFat) {
		this.percentFat = percentFat;
	}

	@Override
	public double discount() {
		if (quantity > 20) {
			return 0.9;
		} else {
			return 1.0;
		}
	}

}