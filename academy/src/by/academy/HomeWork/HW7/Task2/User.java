package by.academy.HomeWork.HW7.Task2;

public class User extends Person {

	private String login;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(String firstName, String lastName, int age, String dateOfBirth, String login, String password,
			String email) {
		super(firstName, lastName, age, dateOfBirth);
		this.login = login;
		this.password = password;
		this.email = email;

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printUserInfo() {
		final StringBuilder sb = new StringBuilder("User[");
		sb.append("firstName: ");
		sb.append(getFirstName());
		sb.append(", lastName: ");
		sb.append(getLastName());
		sb.append(", age: ");
		sb.append(getAge());
		sb.append(", dateOfBirth: ");
		sb.append(getDateOfBirth());
		sb.append(", login: ");
		sb.append(getLogin());
		sb.append(", password: ");
		sb.append(getPassword());
		sb.append(", email: ");
		sb.append(getEmail());
		sb.append(']');
		System.out.println(sb.toString());
	}
}
