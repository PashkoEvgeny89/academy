package by.academy.classwork.lesson7.animal;

public class Animal {
 
	String food;
	String location;
	
	
	Animal(String food, String location){
		this.food=food;
		this.location=location;
	}
	
	Animal(){
		super();
	}
	
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void makeNoise() {
		System.out.println("make noise");
	}
	public void sleep() {
		System.out.println("animal sleep");
	}
	
	public void eat() {
		System.out.println("animal eat");
	}
	
}
