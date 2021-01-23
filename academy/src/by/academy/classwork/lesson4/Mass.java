package by.academy.classwork.lesson4;

import java.util.Arrays;

public class Mass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mas[] =  {1,3,9,4,7};
		
		for (int i=0; i<mas.length; i++) {
			for (int f=0; f<mas.length; f++) {
				if (mas[i]>=mas[f+1]) {
					mas[i]=mas[f+1];
				}
			}
				
		}
		System.out.println(Arrays.toString(mas));
		
		
	
		

	}

}
