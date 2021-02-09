package by.academy.classwork.lesson7;

public class Student {

	String firstName;
	String lastName;
	int group;
	double averageMark;
	
	Student(String firstName, double averageMark){
		this.averageMark=averageMark;
		this.firstName=firstName;
	}

	public int getScholarship(double averageMark) {
		int step = 0;
		if (getAverageMark() == 5.0) {
			step = 100;
		} else {
			step = 80;
		}
		return step;
	}

	Student() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

}
