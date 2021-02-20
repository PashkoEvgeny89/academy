package by.academy.classwork.lesson12;

public class Task1 {
	
	public static void main(String[] args) {
		
		User user=new User("User","243454646");
	
		User.Query q=new User.Query(user);
		q.printToLog();
	}
	
}

/*2.	Переписать предыдущее задание, используя локальный класс. 
 * 3.	Переписать класс Query используя статический класс. */
