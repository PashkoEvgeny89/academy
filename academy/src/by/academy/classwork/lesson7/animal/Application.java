package by.academy.classwork.lesson7.animal;


public class Application {

	public static void main(String[] args) {
		
		Animal[] animal=new Animal[4];
		
		animal[0]=new Animal("vse vpodrjad", "earht");
		animal[1]=new Dog("kostochka", "budka");
		animal[2] =new Cat("moloko", "kovrik");
		animal[3] =new Horse("seno", "hlev");
		
		animal[0].makeNoise();
		animal[1].makeNoise();
		animal[2].makeNoise();
		animal[3].makeNoise();
		
		Veterinar veterinar=new Veterinar();
		
		for (Animal an: animal) {
			veterinar.treatAnimal(an);
		}
		
		

	}

}
