package by.academy.HomeWork.HW7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;

public class TestReflection {

	public static void main(String[] args) {

		User user = new User("Evgeny", "Pashko", 31, "11/07/1989", "PashkoEvgeny", "123456789", "ev.pashko@gmail.com");
		user.printUserInfo();

		Class<User> userClass = User.class;
		Class<? super User> userSuperClass = userClass.getSuperclass();

		System.out.println("\n---------getMethod(\"name\")----------\n");

		try {
			Method userGetLogin = userClass.getMethod("getLogin");
			System.out.println(userGetLogin.toString());
		} catch (NoSuchElementException | NoSuchMethodException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("\n----------getMethods()---------\n");

		Method[] methodsUser = userClass.getMethods();
		for (Method method : methodsUser) {
			System.out.println(method.toString());
		}

		System.out.println("\n---------getField(\"name\")----------\n");

		try {
			Field fieldLogin = userClass.getField("login");
			System.out.println(fieldLogin.toString());
		} catch (NoSuchFieldException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n---------getFields()----------\n");

		Field[] fieldsUser = userClass.getFields();
		for (Field field : fieldsUser) {
			System.out.println(field.toString());
		}

		System.out.println("\n---------getDeclaredMethod(\"name\")----------\n");

		try {
			Method userGetLogin = userClass.getDeclaredMethod("getLogin");
			System.out.println(userGetLogin.toString());
		} catch (NoSuchElementException | NoSuchMethodException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("\n---------getDeclaredMethods()----------\n");

		Method[] declaredMethodsUser = userClass.getDeclaredMethods();
		for (Method method : declaredMethodsUser) {
			System.out.println(method.toString());
		}
		Method[] declaredMethodsUserSuper = userSuperClass.getDeclaredMethods();
		for (Method method : declaredMethodsUserSuper) {
			System.out.println(method.toString());
		}

		System.out.println("\n----------getDeclaredField(\"name\")---------\n");

		try {
			Field fieldLogin = userClass.getDeclaredField("login");
			System.out.println(fieldLogin.toString());
		} catch (NoSuchFieldException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n---------getDeclaredFields()----------\n");

		Field[] declaredFieldsUser = userClass.getDeclaredFields();
		for (Field field : declaredFieldsUser) {
			System.out.println(field.toString());
		}
		Field[] declaredFieldsUserSuper = userSuperClass.getDeclaredFields();
		for (Field field : declaredFieldsUserSuper) {
			System.out.println(field.toString());
		}

		System.out.println("\n----------User info---------\n");

		try {
			Field[] declaredFieldsUserValue = userClass.getDeclaredFields();
			for (Field field : declaredFieldsUserValue) {
				field.setAccessible(true);
				System.out.println(field.get(user));
			}
			Field[] declaredFieldsUserSuperValue = userSuperClass.getDeclaredFields();
			for (Field field : declaredFieldsUserSuperValue) {
				field.setAccessible(true);
				System.out.println(field.get(user));
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("\n----------set new User info---------\n");

		try {

			Field fieldsFirstName = userSuperClass.getDeclaredField("firstName");
			fieldsFirstName.setAccessible(true);
			fieldsFirstName.set(user, "Ivan");

			Field fieldsLastName = userSuperClass.getDeclaredField("lastName");
			fieldsLastName.setAccessible(true);
			fieldsLastName.set(user, "Ivanov");

			Field fieldsLastAge = userSuperClass.getDeclaredField("age");
			fieldsLastAge.setAccessible(true);
			fieldsLastAge.set(user, 0);

			Field fieldsLastDateOfBirth = userSuperClass.getDeclaredField("dateOfBirth");
			fieldsLastDateOfBirth.setAccessible(true);
			fieldsLastDateOfBirth.set(user, "00/00/0000");

			Field fieldLogin = userClass.getDeclaredField("login");
			fieldLogin.setAccessible(true);
			fieldLogin.set(user, "login");

			Field fieldPassword = userClass.getDeclaredField("password");
			fieldPassword.setAccessible(true);
			fieldPassword.set(user, "123");

			Field fieldEmail = userClass.getDeclaredField("email");
			fieldEmail.setAccessible(true);
			fieldEmail.set(user, "belposhta");

		} catch (NoSuchFieldException | IllegalAccessException e) {
			System.out.println(e.getMessage());
		}

		try {
			Method userPrintUserInfo = userClass.getDeclaredMethod("printUserInfo");
			System.out.println(userPrintUserInfo.invoke(user));
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
	}
}
