package by.academy.HomeWork.HW2;

public class Task1 {
	 

	public static void main(String[] args) {

cat("nam-nam-nam", "Hello");

	}

	static int raz(int n) {
		int y;
		y=n*3;
		return y;
	}
	
	static void cat(String s, String p) {
		System.out.println("Kotik delaet "+s+" "+raz(3) +" raz i govorit "+p);
	}
	
	
}
