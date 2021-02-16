package by.academy.deal;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Deal {

	public final static int DEFAULT_PRODUCT_SIZE = 2;

	private String date;
	private Person seller;
	private Person buyer;
	private Product[] products;
	private int productCounter;
	private Double checkSum = 0.0;

	public Deal() {
		super();
	}

	public Double getCheckSum() {
		return checkSum;
	}

	public void setCheckSum(Double checkSum) {
		this.checkSum = checkSum;
	}

	public Deal(String date, Person seller, Person buyer) {
		super();
		this.date = date;
		this.seller = seller;
		this.buyer = buyer;
	}

	public void deadline() {
		Calendar calendar = new GregorianCalendar();
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("Deadline date: " + calendar.getTime());
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void addProduct(Product product) {

		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;
	}
	
	 public void deleteProduct(String name) {
		if (products.length == 0) {
			System.out.println("Product list is empty");
			return;
		}
		for (int i = 0; i < products.length; i++) {
			if (products[i].getType().equals(name)) {
				Product temp = products[products.length - 1];
				products[products.length - 1] = products[i];
				products[i] = temp;
				break;
			}
		}
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	public void printProducts() {
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i];
			System.out.println("Type: " + p.getType());
			System.out.println("Name: " + p.getManufacturer());
			System.out.println("Total Price: " + Math.ceil((p.calcTotalPrice()) * 100) / 100);
			System.out.println("-----------------");
		}
	}

	public void deal() {
		if (getCheckSum() > buyer.getMoney()) {
			System.out.println("Insufficient money");
		} else {
			System.out.println("Buyer "+buyer.getName()+" money: "+ (buyer.getMoney() - getCheckSum()));
			System.out.println("Seller "+seller.getName()+" money: "+ (seller.getMoney() + getCheckSum())+"\n");
		}

	}
	
	public Double printBill() {
		for (Product tmp : products) {
			if (tmp != null) {

				double d = tmp.getPrice() * tmp.getQuantity() * tmp.discount();

				if (tmp instanceof Milk) {
					System.out.print("Milk: ");
				} else if (tmp instanceof Cheese) {
					System.out.print("Cheese: ");
				} else if (tmp instanceof Wine) {
					System.out.print("Wine: ");
				}
				d = Math.ceil(d * 100) / 100; // rounding up the invoice

				System.out.println(tmp.getPrice() + " x " + tmp.getQuantity() + " x " + tmp.discount() + " = " + d);
				checkSum += d;
			}
		}
		System.out.println("-----------------------------");
		System.out.println("Total price: " + checkSum+"\n");
		return checkSum;
	}

}
