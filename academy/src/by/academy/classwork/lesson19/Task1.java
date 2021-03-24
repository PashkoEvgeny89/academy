package by.academy.classwork.lesson19;

public class Task1 implements Runnable{

	@Override
	public void run() {
		int counter=0;
		for (int i=0; i<10; i++) {
		counter++;
		System.out.println("counter run = "+counter);
		
		}
	}
	
	public void start() {
		for (int i=0; i<10; i++) {
		System.out.println("theard start");
	}
	}
	
	
	public static void main(String[] args) {
		Task1 task1=new Task1();
		Thread thread1=new Thread(task1);
		Thread thread2=new Thread(task1);
		
		thread1.run();
		thread2.start();
		
	}

}
