package by.academy.HomeWork.HW7;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {

		Map<Double, String> map = Stream.generate(() -> (long) new Random().nextInt(100)).limit(100).sorted().distinct()
				.map(x -> x * Math.PI - 20).filter(x -> x < 100).skip(3)
				.collect(Collectors.toMap(x -> x, x -> "Number: " + x));

		System.out.println(map);

	}
}