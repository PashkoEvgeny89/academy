package by.academy.deal;

public class Person {
	String name;
	String phone;
	String email;
	Double money;
	String dayOfBirth;
	
	Person(String name, Double money, String phone, String email, String dayOfBirth) {
		
		this.name = name;
		this.money = money;
		this.phone = phone;
		this.email = email;
		this.dayOfBirth=dayOfBirth;
	}

	public String getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	Person() {
		super();
		
	}

}