package by.academy.HomeWork.HW6.Task3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("Evgeny", "Pashko", 31));
		list.add(new User("name2", "surename2", 25));
		list.add(new User("name3", "surename3", 18));
		list.add(new User("name4", "surename4", 99));
		list.add(new User("name5", "surename5", 53));
		list.add(new User("name6", "surename6", 35));
		list.add(new User("name7", "surename7", 2));
		list.add(new User("name8", "surename8", 40));
		list.add(new User("name9", "surename9", 31));
		list.add(new User("name10", "surename10", 23));

		for (User a : list) {
			System.out.println(a);
		}

	}

}
