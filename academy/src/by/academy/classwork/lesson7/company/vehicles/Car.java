package by.academy.classwork.lesson7.company.vehicles;
import by.academy.classwork.lesson7.company.professions.*;
import by.academy.classwork.lesson7.company.details.*;

public class Car {
	String brand;
	String grade;
	int weight;
	Driver driver;
	Engine engine;
	
	//Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: 
	//	"Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". 

	public void printInfo() {
		System.out.println("brand: "+getBrand()+"   weight: "+getWeight()+ "   engine horse power: "+engine.getHorsePower());
	}
	public Car(String brand, int weight) {
		this.brand=brand;
		this.weight=weight;
	}
	
	public void start() {
		System.out.println("go");
	}
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void stop() {
		System.out.println("stop");
	}
	
	public Car(){
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
