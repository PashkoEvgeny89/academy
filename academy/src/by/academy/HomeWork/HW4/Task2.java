package by.academy.HomeWork.HW4;

public class Task2<T extends Object> {

	private T[] tArray;
	
	@SuppressWarnings("unchecked")
	public Task2(){
		super();
		this.tArray=(T[]) new Object[16];
	}
	
	@SuppressWarnings("unchecked")
	public Task2(int n){
		super();
		this.tArray=(T[]) new Object[n];
	}

	public T[] gettArray() {
		return tArray;
	}

	public void settArray(T[] tArray) {
		this.tArray = tArray;
	}
	
	
    }

