package by.academy.deal;

public class Cheese extends Product {

	String smell;
	String color;
	
	Cheese(){
		super();
	}
	
	void eat(){
		System.out.println("eat");
	}
	public String getSmell() {
		return smell;
	}
	public void setSmell(String smell) {
		this.smell = smell;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void cutting() {
		System.out.println("cutting");
	}
}
