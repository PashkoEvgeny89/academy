package by.academy.classwork.lesson4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//    ��������� ���������, ��������� ���������, ������� ��������� ������������
//		����� �� 1 �� n.n �������� � ����������.
		
		
		int n;

		Scanner input = new Scanner(System.in);
		System.out.print("Vvesti n: ");
		n = input.nextInt();
		input.close();
		
		for (int i=0; i<=n; i++) {
			System.out.println("Proizvedenie "+i+" x " +n+" = "+ i*n);
		}

	}

}
