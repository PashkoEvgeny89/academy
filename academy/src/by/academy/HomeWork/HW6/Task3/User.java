package by.academy.HomeWork.HW6.Task3;

public class User {

	private String firstName;
	private String sureName;
	private int years;

	public User(String firstName, String sureName, int years) {
		this.firstName = firstName;
		this.sureName = sureName;
		this.years = years;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSureName() {
		return sureName;
	}

	public void setSureName(String sureName) {
		this.sureName = sureName;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User: ");
		builder.append(firstName);
		builder.append(" ");
		builder.append(sureName);
		builder.append(" ");
		builder.append(years);
		builder.append(" years old");

		return builder.toString();
	}

}
