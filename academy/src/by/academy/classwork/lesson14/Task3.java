package by.academy.classwork.lesson14;

import java.util.TreeSet;


public class Task3 implements Comparable<String> {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<>();
		
		set.add("adgfString1");
		set.add("cdhfString2");
		set.add("bvString3");
		
		System.out.println(set);

	}



	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
