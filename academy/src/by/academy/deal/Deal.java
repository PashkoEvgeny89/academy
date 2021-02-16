package by.academy.deal;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Deal implements Dealinterface {

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
	
	public void deadline() {
		Calendar calendar = new GregorianCalendar();
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		System.out.println("Deadline date: " + calendar.getTime());
	}

	@Override
	public void addProduct(Product product) {

		if (products == null) {
			products = new Product[DEFAULT_PRODUCT_SIZE];
		} else {
			if (productCounter + 1 > products.length) {
				expandProductArray();
			}
		}
		products[productCounter++] = product;  //	System.out.println("The grocery basket is empty");
	}

	@Override
	public void deleteProduct(String type) {
		if (productCounter == 0) {
			System.out.println("Product list is empty");
			return;
		}
		for (int i = 0; i < productCounter; i++) {
			if (products[i].getType().equals(type)) {
				Product temp = products[productCounter - 1];
				products[productCounter - 1] = products[i];
				products[i] = temp;
				productCounter--;
				break;
			}
		}
	}
	
	public void deleteProduct(int index) {
		if (index > products.length || index < 0) {
			System.out.println("Index of bound");
			return;
		}
		if (productCounter != index) {
			System.arraycopy(products, index + 1, products, index, products.length - index - productCounter);
		}
		products[productCounter] = null;
		productCounter--;
	}
	
	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}
	
	public void printProducts() { 
		System.out.println("\nProducts in the grocery basket:\n**********************************");
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i];
			System.out.println("Type: " + p.getType());
			System.out.println("Manufacturer: " + p.getManufacturer());
			System.out.println("Quantity: " + p.getQuantity());
			System.out.println("Price for 1 pc: " + p.getPrice());
			System.out.println("Total price with discount: " + p.calcTotalPrice());
			System.out.println("**********************************");
		}
	}

	@Override
	public void printBill() { 
		System.out.println();
		for (int i = 0; i < productCounter; i++) {
			Product p = products[i]; 
			if (p != null) {
				double d = p.getPrice() * p.getQuantity() * p.discount();
				d = Math.ceil(d * 100) / 100; // rounding up the invoice
				System.out.println(p.getType()+": " +p.getPrice() + " x " + p.getQuantity() + " x " + p.discount() + " = " + d);
				checkSum = checkSum + d;
			}
		}
		System.out.println("**********************************");
		System.out.println("Total price wiht discount: " + checkSum + "\n");
		
	}
	
public void deal() {
		
		if (getCheckSum() > buyer.getMoney()) {
			System.out.println("Insufficient money\n");
		} else {
			System.out.println("The results of the transaction");
			System.out.println("Buyer " + buyer.getName() + " money: " + (buyer.getMoney() - checkSum));
			System.out.println("Seller " + seller.getName() + " money: " + (seller.getMoney() + checkSum+"\n"));
		}
	}
}