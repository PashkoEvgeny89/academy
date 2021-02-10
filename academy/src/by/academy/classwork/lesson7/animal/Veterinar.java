package by.academy.classwork.lesson7.animal;

public class Veterinar {
	
	Veterinar(){
		super();
	}

	public void treatAnimal(Animal a){
		System.out.println(a.getClass().getSimpleName()+"  food: "+a.food+"   location: "+a.location);
		
	}
	

	
	
}
