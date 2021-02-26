package by.academy.HomeWork.HW4.Task2;

public class AppMethod81 {

	public static <T> void main(String[] args) {

		Method81<T> box = new Method81<>(3);
		System.out.println(box.toString());

		Cat cat = new Cat();

		box.addElementToLast('X');
		System.out.println(box.toString());

		box.addElementToFirst(cat);
		System.out.println(box.toString());

		box.addElementByIndex(0, "String");
		box.addElementByIndex(0, 777);
		System.out.println(box.toString());

		System.out.println(box.getElemenByIndex(1));

		System.out.println(box.size());

		System.out.println(box.getLastElement());

		System.out.println(box.getFirstElement());

		box.removeElementByIndex(5);

		System.out.println(box.toString());

		box.removeElementByValue(777);
		System.out.println(box.toString());

	}
}
