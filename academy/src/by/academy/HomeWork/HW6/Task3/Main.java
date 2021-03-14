package by.academy.HomeWork.HW6.Task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static final String FILES_PATH = "src/by/academy/HomeWork/HW6/Task3/Users";

	public static void main(String[] args) {

		ArrayList<User> list = new ArrayList<>();

		list.add(new User("Evgeny", "Pashko", 31));
		list.add(new User("name2", "surename2", 25));
		list.add(new User("name3", "surename3", 18));
		list.add(new User("name4", "surename4", 99));
		list.add(new User("name5", "surename5", 53));
		list.add(new User("name6", "surename6", 35));
		list.add(new User("name7", "surename7", 29));
		list.add(new User("name8", "surename8", 40));
		list.add(new User("name9", "surename9", 31));
		list.add(new User("name10", "surename10", 23));

		File dir = new File(FILES_PATH);

		if (!dir.exists()) {
			dir.mkdirs();
		}

		for (User user : list) {
			try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new FileOutputStream(new File(dir, user.getFirstName() + "_" + user.getSureName())))) {
				objectOutputStream.writeObject(user);
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
