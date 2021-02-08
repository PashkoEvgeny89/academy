package by.academy.classwork.Phone;

public class Phone {
	String number;
	String model;
	int weight;
	
	public void sendMessage(String... numbers) {
		for (String num: numbers) {
		System.out.print(num+"   ");
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void receiveCall(String name) {
		System.out.println("call "+name);
	}
	
	public void receiveCall(String name, String number) {
		System.out.println("call "+name+ " number "+number);
	}
	
	Phone(String number, String model, int weight){
		this(number, model);
		this.weight=weight;
		
	}
	
	
	Phone(String number, String model){
		this.model=model;
		this.number=number;
	}
	
	Phone(String model, int weight) {
		this.model=model;
		this.weight=weight;
	}
	
	Phone(){
		super();
	}
	
	

}
