package by.academy.HomeWork.HW4.Task2;

public class AppMethod81notCounter {

	public static <T> void main(String[] args) {
		
		Method81notCounter<T> box = new Method81notCounter<>(3);
		System.out.println(box.toString());

		Cat cat = new Cat();
		box.addElementToLast(null);
		box.addElementToLast('X');
		box.addElementToLast(3.14);
		System.out.println(box.toString());
	
		box.addElementToFirst(cat);
		System.out.println(box.toString());
		
		box.addElementByIndex(0, null);
		box.addElementByIndex(0, 777);
		System.out.println(box.toString());

		System.out.println(box.getElemenByIndex(3));
		System.out.println(box.getLastElement());
		System.out.println(box.getFirstElement());

		System.out.println(box.size());

		System.out.println(box.getLastFullIndex());

		box.removeElementByIndex(4);
		box.addElementByIndex(0, cat);
		System.out.println(box.toString());

		box.removeElementByValue(cat);
		System.out.println(box.toString());

	}
}