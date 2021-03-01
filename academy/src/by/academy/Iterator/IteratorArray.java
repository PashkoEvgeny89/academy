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
			i++;
			return false;
		}
		if (q >= array[i].length || array[i] == null) {
			return false;
		}
		return true;
	}

	@Override
	public T next() {
		if (i < array.length) {
			return array[i][q++];
		} else
			return array[i][q];
	}

}
