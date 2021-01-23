package by.academy.HomeWork.HW1;

public class DegreeOfNumber2 {

	public static void main(String[] args) {

		for (int i = 0; Math.pow(2, i) <= 1_000_000; i++) {
			System.out.println(" 2 v stepeni " + i + " = " + Math.pow(2, i));

		}
		
	}

}
