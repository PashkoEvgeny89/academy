package by.academy.classwork.lesson7.company.vehicles;

public class Car {
	String brand;
	String grade;
	int weight;

	Car(){
		super();
	}
	Car(String brand, String grade, int weight){
		this.brand=brand;
		this.grade=grade;
		this.weight=weight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
