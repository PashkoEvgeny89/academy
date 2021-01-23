package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 6. В сберкассу на трёхпроцентный вклад положили S рублей.
	//	Какой станет сумма вклада через N лет.

		double s;
		int n;
		

		Scanner input = new Scanner(System.in);
		
		System.out.print("Vvesti summu vklada s: ");
		s = input.nextDouble();
		
		System.out.print("Vvesti kolichestvo let n: ");
		n = input.nextInt();
		input.close();
		
		for (int i=1; i<=n; i++) {
			s = (double)(s+(s*0.03));
		}
		System.out.println("Summa vklada cherez " +n+ " let = "+ s);
	}

}
