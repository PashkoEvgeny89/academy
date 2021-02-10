package by.academy.classwork.lesson7.company.details;

public class Engine {
int horsePower;
String manufacturer;

Engine(){
	super();
}
public Engine(int horsePower, String manufacturer){
	this.horsePower=horsePower;
	this.manufacturer=manufacturer;
}
public int getHorsePower() {
	return horsePower;
}
public void setHorsePower(int horsePower) {
	this.horsePower = horsePower;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}

}
