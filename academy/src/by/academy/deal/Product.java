package by.academy.deal;

public abstract class Product {

	private String type;
	private double price;
	private String manufacturer;
	private int quantity;

	Product(String type, double price, String manufacturer, int quantity) {
		this.type = type;
		this.price = price;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}

	public double discount() {
		if (quantity > 20) {
			return 0.9;
		} else {
			return 1.0;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	Product() {
		super();
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [type=");
		builder.append(type);
		builder.append(", price=");
		builder.append(price);
		builder.append(", manufacturer=");
		builder.append(manufacturer);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}

}