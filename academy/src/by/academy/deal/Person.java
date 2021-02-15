package by.academy.deal;

public class Person {
	private String name;
	private String phone;
	private String email;
	private Double money;
//	public final static Scanner sc = new Scanner(System.in);

	Person(String name, Double money, String phone, String email) {
		this.name = name;
		this.money = money;
		this.phone = phone;
		this.email = email;
	}

/*	public void createPerson() {

		System.out.print("inter Name:");
		name = sc.next();
		System.out.print("inter phone:");
		phone = sc.next();
		System.out.print("inter money (type double):");
		money = sc.nextDouble();
		System.out.print("inter email:");
		email = sc.next(); 
		
		}
		*/
		

	

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