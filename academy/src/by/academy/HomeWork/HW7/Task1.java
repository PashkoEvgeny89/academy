package by.academy.HomeWork.HW7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {

	public static final Random random = new Random();

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			list.add(random.nextInt(100));
		}

		System.out.println(list);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));

		Map<Double, String> map = list.stream().sorted().map(x -> x * Math.PI - 20).distinct().filter(x -> x < 100)
				.collect(Collectors.toMap(x -> x, x -> "Number: " + x));

		System.out.println(map);

	}

}

//flatMapToLong(Function mapper)
//IntStream.range(0,x) – выдаёт на поток элементов с 0 (включительно) по x (не включительно);

//collect(Collector collector) – метод собирает все элементы в список, 
//множество или другую коллекцию, сгруппировывает элементы по какому-нибудь критерию, объединяет всё в строку и т.д.:
//List<String> list = Stream.of(“One”, “Two”, “Three”).collect(Collectors.toList());

//Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100. /
// Отсортировать по возрастанию.
//Пропустив первые 3 числа произвести следующие операции:
