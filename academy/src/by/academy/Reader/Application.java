package by.academy.Reader;

public class Application {

public static void main(String[] args) {
		
		
		/*String name;
	Integer numberReadCard;
	String faculty;
	String dateBirthday;
	String numberPhone;
	
	void print(String... words){
	    for (int i = 0; i < words.length; i++) {
	        System.out.println(words[i]);
	    }
	} */
		
		Reader petrov=new Reader();
		petrov.takeBook(5);
		
		Reader[] reader=new Reader[3];
		
		reader[0]=new Reader("petja", 4561, "fitr_fuck", "17 march 1989", "+375294345345101");
		reader[1]=new Reader("oleg", 4562, "mashfuk", "11 april 1201", "+375235363102");
		reader[2]=new Reader("slava", 4563, "mashfuk", "22 march 1889", "+375294553453103");

		
		reader[0].setDateBirthday("11 july 1989");
		System.out.println(reader[0].getDateBirthday());
		
		for (Reader a: reader) {
			System.out.println(a.getName()+" numberReadCard: "+a.getNumberReadCard());
		}
		
		petrov.nameBook("voina i mir", "sex in big city", "java code");
		
		Book book1=new Book("New Zavet", "Elesey");
		Book book2=new Book("Hello World", "JAVA");
		Book book3=new Book("Programmer", "Pashko Evgeny");
		System.out.println("");
		petrov.nameBookAndAvtorBook(book1, book2, book3);
		System.out.println("");
		reader[1].nameBookAndAvtorBook(book2);
		
		
	}

}
