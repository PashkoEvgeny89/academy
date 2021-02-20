package by.academy.classwork.lesson11;

import java.io.Serializable;

public class Animal implements Serializable {
	
	private static final long serialVersionUID = 1L;
	Animal(){
		super();
	}
	public void eat() {
		System.out.println("am-am-am");
	}

}
