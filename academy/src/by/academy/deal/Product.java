package by.academy.deal;

import java.util.Scanner;

public abstract class Product {

	protected String type;
	protected double price;
	protected String manufacturer;
	protected int quantity;
	public final static Scanner sc = new Scanner(System.in);

	Product(String type, double price, String manufacturer, int quantity) {
		this.type = type;
		this.price = price;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
	}
	
	public void createProduct() {

		System.out.print("inter type:");
		type = sc.next();
		System.out.print("inter manufacturer:");
		manufacturer = sc.next();
		System.out.print("inter price (type double):");
		price = sc.nextDouble();
		System.out.print("inter quantity:");
		quantity = sc.nextInt();
		}

	public abstract double discount();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public final double calcTotalPrice() {
		return quantity * price * discount();
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