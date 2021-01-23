package by.academy.classwork.lesson1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat cat1=new Cat();
Cat cat2=new Cat("Vasja");
cat2.eat();
cat2.sleep();
cat2.walk();
cat1.grow();
cat1.grow();
cat1.grow();
System.out.println("cat1 "+cat1.age+" years old");
	}

}
