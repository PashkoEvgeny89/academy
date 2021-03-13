package by.academy.classwork.lesson18;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		
		Cat cat=new Cat("yellow", (short) 7);
		System.out.println(cat);
		System.out.println(cat.color);
		System.out.println(cat.getYears());
		System.out.println(Cat.getKolichestvolap());
		
		Tiger tiger=new Tiger();
		System.out.println(tiger.getColor());
		cat.eat();
		tiger.eat();
		System.out.println(Tiger.getKolichestvolap());
		
		Cat cat1=new Tiger();
		cat1.eat();
		System.out.println();
		
		

	}

}
