package by.academy.classwork.lesson4;

public class Task9 {

	public static void main(String[] args) {
	
		//   9. ���� ����������� ����� �� 35 �� 87. ����� � ���������� �� �� ���,
		//  ������� ��� ������� �� 7 ���� ������� 1, 2 ��� 5.

		for (int a=35; a<=87; a++) {
			if (a%7==1 || a%7==2 || a%7==5) {
				System.out.println(a);
			}

		}
	}

}
