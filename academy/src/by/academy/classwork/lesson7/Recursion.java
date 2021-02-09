package by.academy.classwork.lesson7;

public class Recursion {

	public static void rec(int a, int b) {
		if (a < b) {
			System.out.println(a);
			a++;
			rec(a, b);
		} 
		
		if (b<a){
			
			--a;
			System.out.println(a);
			rec(a, b);
		}
	}

//	5.	Даны два целых числа A и В. Выведите все числа от A до B включительно,
//	в порядке возрастания, если A < B, или в порядке убывания в противном случае. 
//	Использовать рекурсию

	public void recursionFucn() {
		System.out.println("Привет, JavaRush!");
		recursionFucn();
	}

	public static void main(String[] args) {

		rec(2, 9);
	}

}
