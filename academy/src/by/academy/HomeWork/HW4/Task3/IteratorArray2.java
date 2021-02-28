package by.academy.HomeWork.HW4.Task3;

import java.util.Iterator;

public class IteratorArray2<T> implements Iterator<Object> {

	private T[][] array;
	private int i;
	private int q;

	public IteratorArray2(T[][] array) {
		super();
		this.array = array;
	}



	@Override
	public boolean hasNext() {
		return i < array.length && q < array[i].length;
	}

	@Override
	public T next() {
		T temp = array[i][q++];
		if (q >= array[i].length) {
			i++;
			q = 0;
		}
		return (T) temp;   
	}  
}
