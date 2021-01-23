package by.academy.classwork.lesson1;

public class Cat {
	int age;
	String nickname;

	public void grow() {
		age = age + 1;
	}

	public void sleep() {
		System.out.println("Z-Z-Z-");
	}

	public void eat() {
		System.out.println("Njam-njam-njam");
	}

	public void walk() {
		System.out.println("Go street");
	}

	public Cat() {
		super();
	};

	public Cat(String nickname) {
		super();
		this.nickname = nickname;
	}

}
