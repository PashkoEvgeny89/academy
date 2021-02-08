package by.academy.classwork.Phone;

public class Aplication {

	public static void main(String[] args) {

		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();

		phone1.model = "iphone5s";
		phone1.number = "+375295673108";
		phone1.weight = 127;

		phone2.model = "samsung";
		phone2.number = "+3752950422335";
		phone2.weight = 136;

		phone3.model = "iphone11";
		phone3.number = "+375292601338";
		phone3.setWeight(150);

		System.out.println("MODEL:" + phone1.getModel() + "   NUMBER:" + phone1.getNumber() + "   WEIGHT:" + phone1.weight);
		System.out.println("MODEL:" + phone2.getModel() + "   NUMBER:" + phone2.getNumber() + "   WEIGHT:" + phone2.weight);
		System.out.println("MODEL:" + phone3.getModel() + "   NUMBER:" + phone3.getNumber() + "   WEIGHT:" + phone3.weight);

		phone1.receiveCall("Andrey");

		Phone phone4 = new Phone("+375295345345", "samsungA5", 140);
		phone4.setWeight(160);
		System.out.println("MODEL:" + phone4.getModel() + "   NUMBER:" + phone4.getNumber() + "   WEIGHT:" + phone4.getWeight());
		phone2.receiveCall("Gena", "+375293452176");
		
		phone2.sendMessage("4243423423","e345454543534", "5345645545tt545");
	}

}