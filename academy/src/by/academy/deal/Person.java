package by.academy.deal;

public class Person {
	String name;
	String phone;
	String email;
	Double money;

	Person(String name, Double money, String phone, String email) {
		this.name = name;
		this.money = money;
		this.phone = phone;
		this.email = email;
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