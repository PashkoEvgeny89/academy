package by.academy.Iterator;

import java.util.Iterator;

public class IteratorArray<T> implements Iterator<T> {

	private T[][] array;
	private int i = 0;
	private int q = 0;

	IteratorArray(T[][] array) {
		super();
		this.array = array;
	}

	public T[][] getArray() {
		return array;
	}

	public void setArray(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {

		if (i >= array.length || array == null) {

			return false;
		}
		if (q > array[i].length || array[i] == null) {
			return false;
		}
		if (i>=array.length && q==array[i].length) {
			return false;
		}
		return true;
	}

	@Override
	public T next() {
		T value=array[i][q++];
		if (q == array[i].length) {
				i++;
				q = 0;
				}
		
			return value;
			
		


	}
}
