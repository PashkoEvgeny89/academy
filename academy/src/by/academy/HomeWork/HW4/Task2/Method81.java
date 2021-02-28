package by.academy.HomeWork.HW4.Task2;

public class Method81<T extends Object> {
	private T[] arr;
	private int counter=0;

	@SuppressWarnings("unchecked")
	public Method81() {
		super();
		this.arr = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public Method81(int n) {
		super();
		this.arr = (T[]) new Object[n];
	}

	// увеличение размера массива при необходимости
	@SuppressWarnings("unchecked")
	private void growArray() {
		if (arr[arr.length - 1] != null) {
			T[] arr2 = (T[]) new Object[arr.length * 2 + 1];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			arr = arr2;
		}
	}

	// 1.1 добавление элемента массива в конец
	@SuppressWarnings("unchecked")
	public void addElementToLast(Object value) {
		growArray();
		arr[counter] = (T) value;
		counter++;
	}

	// 1.2 добавление элемента массива в начало
	@SuppressWarnings("unchecked")
	public void addElementToFirst(Object value) {
		growArray();
		for (int i = counter-1; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
		arr[0] = (T) value;
		counter++;
	}

	// 1.3 добавление элемента массива по индексу
	@SuppressWarnings("unchecked")
	public void addElementByIndex(int index, Object value) {
		growArray();
		if (index <= counter) {
			for (int i = counter; i >= index; i--) {
					arr[i + 1] = arr[i];
			}
			arr[index] = (T) value;
			counter++;
		} else
			System.out.println(
					"Element is not added! Index " + index + " out of bounds for array size. Max Index " + counter);
	}

	// 2 взятие элемента по индексу
	@SuppressWarnings("unchecked")
	public T getElemenByIndex(int index) {
		if (index < counter) {
			return arr[index];
		} else
			return (T) ("Index " + index + " out of bounds for array size! Max Index " + (counter-1));
	}

	// 3 взятие последнего элемента
	public T getLastElement() {
		return arr[counter-1];
	}

	// 4 взятие первого элемента
	public T getFirstElement() {
		return arr[0];
	}

	// 5 размер массива
	public int size() {
		return counter;
	}

	// 6 вывод индекса последнего заполненного элемента
	public int getLastFullIndex() {
		return counter-1;
	}

	// 7 удаление элемента по индексу
	public void removeElementByIndex(int index) {
		if (index < counter) {
			for (int i = index; i < counter-1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[counter-1] = null;
			counter--;
		} else
			System.out.println("Index " + index + " out of bounds for array size! Max Index " + (counter-1));
	}

	// 8 удаление элемента по значению
	public void removeElementByValue(Object value) {
		int removeIndex = 0;
		for (int i = 0; i < counter; i++) {
			while (arr[i].equals(value)) {
				removeIndex = i;
				i--;
				for (int q = removeIndex; q < counter-1; q++) {
					arr[q] = arr[q + 1];
				}
				arr[counter-1] = null;
				counter--;
				break;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Values on array: ");
		if (counter==0) {
			builder.append("array empty");
		} else {
		for (int i = 0; i < counter; i++) {
			builder.append(arr[i]);
			if (i < counter-1) {
				builder.append(", ");
			}
		}
		}
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}


}
