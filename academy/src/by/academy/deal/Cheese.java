package by.academy.deal;

public class Cheese extends Product {

	private int age;
	String color;
	
	Cheese(){
		super();
	}
	
	void eat(){
		System.out.println("eat");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
	
	public void discount(int age) {
		if (age>20) {
			price=price-price*0.2;
		}
	}
	
}
