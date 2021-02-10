package by.academy.classwork.lesson7.animal;

public class Dog extends Animal{

	int year;
	
	Dog(String food, String location){
		this.food=food;
		this.location=location;
	}
	@Override
	public void makeNoise() {
		System.out.println("gav gav gav");
	}
	
	Dog(){
		super();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
