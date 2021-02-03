package by.academy.deal;

public class Deal {

	Person seller;
	Person buyer;
	Product[] product;
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
		return product;
	}
	public void setProduct(Product[] product) {
		this.product = product;
	}
	public String getDealDate() {
		return dealDate;
	}
	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}
	
	
}
