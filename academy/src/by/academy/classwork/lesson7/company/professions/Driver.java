package by.academy.classwork.lesson7.company.professions;

public class Driver {

	String name;
	int driveYears;
	Driver(){
		super();
	}
	Driver(String name, int driveYears){
		this.name=name;
		this.driveYears=driveYears;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDriveYears() {
		return driveYears;
	}
	public void setDriveYears(int driveYears) {
		this.driveYears = driveYears;
	}
	 
}
