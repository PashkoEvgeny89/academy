package by.academy.Reader;

public class Book {
	String nameBooks;
	String avtorBooks;
	
	Book(String nameBooks, String avtorBooks){
		this.avtorBooks=avtorBooks;
		this.nameBooks=nameBooks;
	}
	
	Book(){
		super();
	}

	public String getNameBooks() {
		return nameBooks;
	}

	public void setNameBooks(String nameBooks) {
		this.nameBooks = nameBooks;
	}

	public String getAvtorBooks() {
		return avtorBooks;
	}

	public void setAvtorBooks(String avtorBooks) {
		this.avtorBooks = avtorBooks;
	}
	

}
