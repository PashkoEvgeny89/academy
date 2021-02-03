package by.academy.deal;

public class Wine extends Product {

	Double volume;
	String color;
	
	Wine(){
		super();
	}
	
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void drink(){
		System.out.println("drink");
	}
	void pay() {
		System.out.println("pay");
	}
	
}
