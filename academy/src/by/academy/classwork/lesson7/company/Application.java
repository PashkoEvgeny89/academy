
package by.academy.classwork.lesson7.company;
import by.academy.classwork.lesson7.company.details.Engine;
import by.academy.classwork.lesson7.company.vehicles.*;

public class Application {

	public static void main(String[] args) {
		
	//	Car car1=new Car();
	//	car1.stop();
	//	car1.printInfo();
		
		Engine engine=new Engine(345,"fordmotors");
		Car car1=new Car("Bently", 2350, engine);
		car1.printInfo();
		
	}

}
