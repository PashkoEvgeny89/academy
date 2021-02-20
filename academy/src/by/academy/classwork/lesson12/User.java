package by.academy.classwork.lesson12;

public class User {
	
private String login;
private String password;

 User(){
	 super();
 }
 User(String login, String password){
	 this.login=login;
	 this.password=password;
 }
 
 public void createQuery() {
	 class Query {
		  public void printToLog() {
			  System.out.println("User: "+ User.this.login);
		  }
	  }
	 Query q=new Query();
	 q.printToLog();
 }

  


}

/*
 * 1. Создать класс User, содержащий private переменные login, password. Создать
 * внутренний класс Query в классе User. Класс Query содержит метод
 * printToLog(), который распечатывает на консоль сообщение о том что
 * пользователь с таким то логином и паролем отправил запрос. Класс User,
 * содержит метод createQuery(), в котором создается объект класса Query и
 * вызывается метод printToLog(). В методе main(): создать экземпляр класса User
 * и вызвать метод createQuery(); создать экземпляр класса Query и вызвать метод
 * printToLog() используя конструкцию user.new Query(); создать экземпляр класса
 * Query и вызвать метод printToLog() используя конструкцию new User().new
 * Query();
 */