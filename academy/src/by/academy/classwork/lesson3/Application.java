package by.academy.classwork.lesson3;

public class Application {
	public static void main(String[] args) {
		Cat noNameCat = new Cat();
		Cat adolf = new Cat("Adolf");

		adolf.eat();
		adolf.sleep();
		adolf.walk();

		for (int i = 0; i < 3; i++) {
			noNameCat.grow();
		}
		System.out.println("Cat age: " + noNameCat.age + "\n");

		// ��������� ��������
		System.out.println("Name: " + adolf.nickname);
		System.out.println("Initials: " + adolf.getInitials() + "\n");

		// ��������� �������� ��� ��� ���
		System.out.println("Name: " + adolf.nickname);
		System.out.println(adolf.isHomeAnimal());
		System.out.println("Name: " + noNameCat.nickname);
		System.out.println(noNameCat.isHomeAnimal());
	}
}
