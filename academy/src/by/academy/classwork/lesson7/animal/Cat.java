package by.academy.classwork.lesson7.animal;

public class Cat extends Animal {
	
	@Override
	public void makeNoise() {
		System.out.println("may may may");
	} 
	Cat(){
		super();
	}
	
	Cat(String food, String location){
		this.food=food;
		this.location=location;
	}
	

}
