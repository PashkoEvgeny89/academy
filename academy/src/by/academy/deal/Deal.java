package by.academy.deal;

public class Deal {

	Person seller;
	Person buyer;
	Product[] products;
	String dealDate;
	
	Deal(){
		super();
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
	public Product[] getProduct() {
		return products;
	}
	public void setProduct(Product[] product) {
		this.products = product;
	}
	public String getDealDate() {
		return dealDate;
	}
	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}
	
	public Double checkBill() {
		Double checkSum=0.0;
		
		for (Product tmp:products) {
			checkSum+=tmp.getPrice()*tmp.getQuantity()*tmp.discount();			
			}
		return checkSum;
	}

	
	
}
