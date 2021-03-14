package by.academy.classwork.lesson17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task2 {

	    public static final String PATHNAME = "src/academy/by/academy/homework/hw6/Task2";

	    public static void main(String[] args) {

	        File file = new File(PATHNAME);
	        if (!file.exists()) {
	            file.mkdirs();
	        }

	        try (InputStream inputStream = new FileInputStream(new File(file, "Task2.txt"));
	             OutputStream outputStream = new FileOutputStream(new File(file, "result.txt"))) {
	            int readByte;
	            while (inputStream.available() > 0) {
	                readByte = inputStream.read();
	                if (readByte != 32) {
	                    outputStream.write(readByte);
	                }
	            }
	        } catch (IOException message) {
	            message.getStackTrace();
	        }
	    }

	}