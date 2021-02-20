package by.academy.classwork.lesson4;

public class AppCar {

	public static void main(String[] args) {
		
		Car car = new Car();
		Car car2 = new Car();
		car.setSpeed(100);
		car2.setSpeed(120);
		System.out.println(car.getSpeed());
		System.out.println(car2.getSpeed());

	}

}
