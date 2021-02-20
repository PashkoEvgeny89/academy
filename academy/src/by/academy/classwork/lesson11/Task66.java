package by.academy.classwork.lesson11;

public class Task66 {

	public static void main(String[] args) {
		Animal cat=new Animal();
		Task6<String, Animal, Integer> var = new Task6<>("qwerty", cat , 6);
		var.name();
		System.out.println();
	}

}
