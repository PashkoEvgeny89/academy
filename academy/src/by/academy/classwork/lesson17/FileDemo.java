package by.academy.classwork.lesson17;

import java.io.File;

public class FileDemo {

		public static void main(String[] args) {

			File file = new File("src/by/academy/classwork/lesson17");

			if (!file.exists()) {
				file.mkdirs();
			}
		//	System.out.println(file.isAbsolute());

			for (File f : file.listFiles()) {
				System.out.println("Имя файла: " + f.getName());
				System.out.println("Путь: " + f.getPath());
				System.out.println("Абсолютный путь: " + f.getAbsolutePath());
				System.out.println("Родительский каталог: " + f.getParent());
				System.out.println(f.exists() ? "Файл/каталог существует." : "Файл/каталог не существует.");
				System.out.println(f.canWrite() ? "Файл/каталог доступен для редактирования."
						: "Файл/каталог не доступен для редактирования.");
				System.out.println(
						f.canRead() ? "Файл/каталог доступен для чтения." : "Файл/каталог не доступен для чтения.");
				System.out.println((f.isDirectory() ? "Каталог." : "Не каталог."));
				System.out.println(f.isFile() ? "Файл." : "Не файл.");
				System.out.println(f.isAbsolute() ? "Абсолютный путь." : "Не абсолютный путь.");
				System.out.println("Дата последнего редактирования: " + f.lastModified());
				System.out.println("Размер: " + f.length() + " байт.");

				System.out.println("----------------------------------------------------------");
			}

		}
	}
