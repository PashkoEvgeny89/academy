package by.academy.HomeWork.HW2;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 		Напишите программу Deal.java, 
  		которая должна имитировать раздачу карт для игры в покер. 
		Программа получает число n, задаваемое с консоли пользователем, 
		и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды. 
		Разделяйте пять карт, выданных каждому игроку, пустой строкой.
 */
		//.add добавляет элемент в массив
		
		ArrayList<String> koloda = new ArrayList<String>();
	//	koloda.add("2 chirva");
		String[] masti={"_chervi","_bubna","_trevi","_piki"};
		String[] big={"V","D","K","T"};
		for (int q=0; q<masti.length; q++) {
		for (int i=2; i<=10; i++) {
			koloda.add(i+masti[q]);
		}
		for (int k=0; k<big.length; k++) {
			koloda.add(big[k]+masti[q]);
		}
		
		}
		
		
		

	//	System.out.println(koloda.get(0));
		System.out.println(koloda.size());
		System.out.println(koloda);
		//koloda.remove(2);

	}

}
